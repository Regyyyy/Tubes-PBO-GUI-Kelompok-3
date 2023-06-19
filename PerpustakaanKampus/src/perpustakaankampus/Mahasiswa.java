/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import DatabasePerpustakaan.DatabaseBuku;
import DatabasePerpustakaan.DatabaseRiwayatPeminjaman;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author User
 */
public class Mahasiswa extends Guest implements Logout {
    private String username;
    private String password;
    private String nama;
    private String nim;
    
    public Mahasiswa() { };
    
    public Mahasiswa(String username, String password, String nama, String nim) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.nim = nim;
    }
    
    public Peminjaman meminjamBuku(String kodeBuku) {
        DatabaseBuku bukuDao = new DatabaseBuku();
        DatabaseRiwayatPeminjaman peminjamanDao = new DatabaseRiwayatPeminjaman();
        List<Peminjaman> allPeminjaman = peminjamanDao.getAllPeminjaman();
        List<Buku> newBuku = bukuDao.getBuku(kodeBuku);
        Buku buku = newBuku.get(0);
        Peminjaman peminjamanBaru = new Peminjaman();
        peminjamanBaru.setIdPeminjaman(Integer.toString(allPeminjaman.size()+1));
        peminjamanBaru.setNim(nim);
        peminjamanBaru.setKodeBuku(buku.getKodeBuku());
        peminjamanBaru.setJudulBuku(buku.getJudulBuku());
        ZoneId defaultID = ZoneId.systemDefault();
        LocalDate localDatePinjam = LocalDate.now();
        peminjamanBaru.setTanggalPinjam(localDatePinjam);
        LocalDate localDateBatas = LocalDate.now().plusDays(7);
        peminjamanBaru.setBatasPinjam(localDateBatas);
        peminjamanBaru.setDisetujui(false);
        peminjamanBaru.setSelesai(false);
        peminjamanBaru.setDenda(0);
        peminjamanBaru.setKondisiBuku(null);
        return peminjamanBaru;
    }
    
    public void mengembalikanBuku() {}
    
    public void memperpanjangBuku(String idPeminjaman, String nim) {
        DatabaseRiwayatPeminjaman peminjamanDao = new DatabaseRiwayatPeminjaman();
        List<Peminjaman> newPeminjaman = peminjamanDao.getPeminjaman(nim);
        Peminjaman peminjamanMhs = new Peminjaman();
        boolean found = false;
        for (int i = 0; i < newPeminjaman.size() && !found ; i++) {
            if (newPeminjaman.get(i).getIdPeminjaman().equals(idPeminjaman)) {
                found = true;
                peminjamanMhs = newPeminjaman.get(i);
            }
        }
//        Date batasPinjam = peminjamanMhs.getBatasPinjam();
//        //ZoneId defaultID = ZoneId.systemDefault();
//        LocalDate localDateBatasPinjam = batasPinjam.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        localDateBatasPinjam = localDateBatasPinjam.plusDays(7);
//        peminjamanMhs.setBatasPinjam(Date.from(localDateBatasPinjam.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }
    
    public TablePeminjaman lihatRiwayat(String nim) {
        List<Peminjaman> listAllPeminjaman;
        List<Peminjaman> newListPeminjaman = new ArrayList();
        DatabaseRiwayatPeminjaman peminjamanDao = new DatabaseRiwayatPeminjaman();
        listAllPeminjaman = peminjamanDao.getAllPeminjaman();
        for (Peminjaman peminjaman : listAllPeminjaman) {
            if (peminjaman.getNim().equals(nim)) {
                newListPeminjaman.add(peminjaman);
            }
        }
        TablePeminjaman table = new TablePeminjaman(newListPeminjaman);
        return table;
    }
    
    @Override
    public void logoutAkun(Guest guest, String loginAs) {
        if (guest instanceof Mahasiswa) {
            guest = null;
            loginAs = "Guest";
        }
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    
}
