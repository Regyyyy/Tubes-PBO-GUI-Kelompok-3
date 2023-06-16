/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.*;
import database.*;
import perpustakaan.*;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class ControllerApp {
    // Declare semua menu.
 
    private formRiwayatPeminjaman formRiwayat;
    List<Peminjaman> listPeminjaman;  
    private DatabaseRiwayatPeminjaman dbPeminjaman;
    
    // Declare variable user.
    
    
    
    
    
    public ControllerApp(formRiwayatPeminjaman form) {
        // Pembuatan objek semua menu.
        this.formRiwayat = form;
        dbPeminjaman = new DatabaseRiwayatPeminjaman();
        listPeminjaman = dbPeminjaman.getAllPeminjaman();
        
    }
    
     
    public void isiTable() {
        listPeminjaman = dbPeminjaman.getAllPeminjaman();
        TablePeminjaman table = new TablePeminjaman(listPeminjaman);
        formRiwayat.getTableRiwayat().setModel(table);
    }
    
    /*
    Method untuk verifikasi login, akan login
    sesuai dengan rolenya.
    */
    /*
    public void verifyLogin() {
        // Catat semua inputan.
        String usernameInput = login.getjTextField1().getText();
        String passwordInput = login.getjPasswordField1().getText();
        login.getjRadioButton1().setActionCommand("Mahasiswa");
        login.getjRadioButton2().setActionCommand("Admin");
        
        try {
            if (login.getButtonGroup1().getSelection().getActionCommand().equals("Mahasiswa")) {
            
                // Mahasiswa newMhs = DatabaseMember.cariMahasiswa();

                // Demo.
                if (usernameInput.equals("regy") && passwordInput.equals("1234")) {
                    mhsAccount = new Mahasiswa("regy","1234","Regy Renanda Rahman","1302213117");
                    home.setVisible(false);
                    homeMhs.getLoginAs().setText(mhsAccount.getNama() + " (Mahasiswa)");
                    login.setVisible(false);
                    homeMhs.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Username atau password salah");  
                }
                
            } else if (login.getButtonGroup1().getSelection().getActionCommand().equals("Admin")) {
                if (usernameInput.equals("herlin") && passwordInput.equals("5678")) {
                    adminAccount = new Admin("herlin","5678","Herlin Priatna","p-52");
                    home.setVisible(false);
                    homeAdmin.getLoginAs().setText(adminAccount.getNama() + " (Admin)");
                    login.setVisible(false);
                    homeAdmin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Username atau password salah");  
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Akun tidak terdaftar");
        }
        
    }
    */
    /*
    Method untuk logout dari semua akun.
    
    public void logoutAllAccount() {
        mhsAccount = null;
        adminAccount = null;
    }
    
    // Beberapa method navigasi.
    
    /*
    Method untuk form yang memiliki tombol back
    ke Home Menu.
    */
/*    public void showHomeMenu(javax.swing.JFrame page) {
        if (page instanceof MenuMahasiswa) {
            page.setVisible(false);
            homeMhs.setVisible(true); 
        } else if (page instanceof MenuAdmin) {
            page.setVisible(false);
            homeAdmin.setVisible(true); 
        } else {
            page.setVisible(false);
            home.setVisible(true);  
        }
    }
    
    /*
    Method untuk menampilkan menu login.
    */
  /*  public void showLoginMenu() {
        home.setVisible(false);
        login.getjTextField1().setText("regy");
        login.getjPasswordField1().setText("1234");
        login.getjRadioButton1().setSelected(true);
        login.setVisible(true);
    }
    
    /*
    Method untuk menampilkan menu riwayat peminjaman.
    */
    
   /*
    public void showRiwayatPeminjamanMenu() {
        
        List<Peminjaman> listRiwayat = new ArrayList();
        listRiwayat.add(new Peminjaman()); 
//        riwayat.getjTable1().setModel(listRiwayat);
        riwayat.setVisible(true);
    }
    */
  /*  
    public void showRecommendedBookDetails(int idx) {
        if (loginAs.equals("Admin")) {
            homeAdmin.setVisible(false);
        } else if (loginAs.equals("Mahasiswa")) {
            homeMhs.setVisible(false);
        } else {
            home.setVisible(false);
        }
        
        detailBuku.getJudulBuku().setText("Judul : "+RecommendedBooks.get(idx).getJudulBuku());
        detailBuku.getjLabel1().setText("Kode buku : "+RecommendedBooks.get(idx).getKodeBuku());
        detailBuku.getjLabel2().setText("Author : "+RecommendedBooks.get(idx).getAuthor());
        detailBuku.getjLabel3().setText("Tahun terbit : "+RecommendedBooks.get(idx).getTahunTerbit());
        detailBuku.getjLabel4().setText("Kategori : "+RecommendedBooks.get(idx).getKategoriBuku());
        detailBuku.getjLabel5().setText("Stok buku : "+RecommendedBooks.get(idx).getStokBuku());
        detailBuku.getjLabel6().setText("Banyak peminjaman : "+RecommendedBooks.get(idx).getFrekPeminjaman());
        // Belum bisa warp text.
        detailBuku.getjLabel7().setText("Abstract : \n"+RecommendedBooks.get(idx).getAbstrak());
        detailBuku.setVisible(true);
        
    }
*/
}
