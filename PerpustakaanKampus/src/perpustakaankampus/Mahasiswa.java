/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import DatabasePerpustakaan.DatabaseRiwayatPeminjaman;
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
    
    public void meminjamBuku() {}
    
    public void mengembalikanBuku() {}
    
    public void memperpanjangBuku() {}
    
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
