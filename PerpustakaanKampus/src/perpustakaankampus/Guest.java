/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import DatabasePerpustakaan.DatabaseBuku;
import DatabasePerpustakaan.DatabaseMember;
import Komparasi.ComparatorFrekuensi;
import java.util.*;

/**
 *
 * @author User
 */
public class Guest {
    public Guest() {}
    
    public TableBuku lihatDaftarBuku(List<Buku> allBook) {
        TableBuku table = new TableBuku(allBook);
        return table;
    }
    
    /*
    Method untuk melakukan login.
    */
    public boolean login(String loginAs, String username, String password, Mahasiswa mhsAccount, Admin adminAccount) throws Exception {
        DatabaseMember memberDao = new DatabaseMember();
        try {
            if (loginAs == "Mahasiswa") {
                adminAccount = null;
                List<Mahasiswa> mhsTerdaftar = memberDao.getMahasiswa(username); // Ambil mahasiswa dari database sesuai username.
                for (Mahasiswa mhs : mhsTerdaftar) {
                    if (mhs.getUsername().equals(username)) {
                        if (mhs.getPassword().equals(password)) {
                            mhsAccount.setUsername(mhs.getUsername());
                            mhsAccount.setPassword(mhs.getPassword());
                            mhsAccount.setNama(mhs.getNama());
                            mhsAccount.setNim(mhs.getNim());
                            return true;
                        }
                    }
                }
            } else if (loginAs == "Admin") {
                mhsAccount = null;
                List<Admin> adminTerdaftar = memberDao.getAdmin(username); // Ambil admin dari database sesuai username.
                for (Admin admin : adminTerdaftar) {
                    if (admin.getUsername().equals(username)) {
                        if (admin.getPassword().equals(password)) {
                            adminAccount.setUsername(admin.getUsername());
                            adminAccount.setUsername(admin.getPassword());
                            adminAccount.setNama(admin.getNama());
                            adminAccount.setKodePustakawan(admin.getKodePustakawan());
                            return true;
                        }
                    }
                }   
            }
            loginAs = "Guest";
            return false;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    /*
    Method search engine simple untuk mencari buku di list semua buku.
    */
    public List<Buku> cariBuku(String keyword, List<Buku> allBook) {
        List<Buku> listHasil = new ArrayList();
        for (Buku buku : allBook) {
            if (buku.getJudulBuku().toLowerCase().contains(keyword) || buku.getAuthor().toLowerCase().contains(keyword)) {
                listHasil.add(buku);
            }
        }
        return listHasil;
    }
    
    /*
    Method untuk mengambil buku yang ingin diperlihatkan.
    */
    public Buku lihatDetailBuku(String kodeBuku) {
        DatabaseBuku bukuDao = new DatabaseBuku();
        List<Buku> newBuku = bukuDao.getBuku(kodeBuku);
        return newBuku.get(0);
    }
    
    /*
    Method untuk mendapatkan list rekomendasi buku.
    */
    public List<Buku> lihatRekomendasiBuku(List<Buku> allBook) {
        List<Buku> tempListBuku = allBook;
        List<Buku> newListBuku = new ArrayList();
        
        Collections.sort(tempListBuku, new ComparatorFrekuensi());
        
        for (int i = 0; i < 5; i++) {
            newListBuku.add(tempListBuku.get(i));
        }
        
        return newListBuku;
    }
}
