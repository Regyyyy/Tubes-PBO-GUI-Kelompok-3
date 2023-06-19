/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerPerpustakaan;

import DatabasePerpustakaan.*;
import GUIPerpustakaan.*;
import java.util.*;
import javax.swing.JOptionPane;
import perpustakaankampus.*;

/**
 *
 * @author User
 */
public class ControllerApp {
    // Declare semua menu.
    private MenuHome home;
    private MenuLogin login;
    private MenuHomeMahasiswa homeMhs;
    private MenuHomeAdmin homeAdmin;
    private MenuRiwayatPeminjaman riwayat;
    private MenuDetailBuku detailBuku;
    private MenuPeminjamanBuku peminjamanBuku;
    private MenuPengembalianBuku pengembalianBuku;
    private MenuListBuku listBuku;
    private MenuUpdateBuku updateBuku;
    private MenuKonfirmasi konfirmasi;
    
    // Declare semua class database.
    private DatabaseBuku dbBuku;
    private DatabaseMember dbMember;
    private DatabaseRiwayatPeminjaman dbPeminjaman;
    
    // Declare variable user.
    private String loginAs; // Mengetahui login sebagai role apa
    private Guest guestAccount; // Default ketika masuk ke app
    private Mahasiswa mhsAccount; // Objek ketika login as mahasiswa
    private Admin adminAccount; // Objek ketka login as admin
    
    // Declare atribut lain.
    private List<Buku> AllBook;
    private List<Buku> RecommendedBooks;
    
    public ControllerApp(MenuHome home) {
        // Pembuatan objek semua menu.
        this.home = home;
        login = new MenuLogin(this);
        riwayat = new MenuRiwayatPeminjaman(this);
        homeMhs = new MenuHomeMahasiswa(this);
        homeAdmin = new MenuHomeAdmin(this);
        detailBuku = new MenuDetailBuku(this);
        peminjamanBuku = new MenuPeminjamanBuku(this);
        pengembalianBuku = new MenuPengembalianBuku(this);
        listBuku = new MenuListBuku(this);
        
        // Pembuatan semua class database.
        dbBuku = new DatabaseBuku();
        dbMember = new DatabaseMember();
        dbPeminjaman = new DatabaseRiwayatPeminjaman();
        
        // Pembuatan variable user.
        loginAs = "Guest";
        guestAccount = new Guest();
        
        // Mendapatkan semua list buku.
        AllBook = dbBuku.getAllBuku();
        System.out.println(AllBook.size());
        
        // Mendapatkan rekomendasi buku dan menampilkannya di semua main menu.
        RecommendedBooks = guestAccount.lihatRekomendasiBuku(AllBook);

        // Main menu guest.
        home.getBukuRec1().setText(RecommendedBooks.get(0).getJudulBuku());
        home.getBukuRec2().setText(RecommendedBooks.get(1).getJudulBuku());
        home.getBukuRec3().setText(RecommendedBooks.get(2).getJudulBuku());
        home.getBukuRec4().setText(RecommendedBooks.get(3).getJudulBuku());
        home.getBukuRec5().setText(RecommendedBooks.get(4).getJudulBuku());
        
        home.getTahunTerbitBukuRec1().setText(RecommendedBooks.get(0).getTahunTerbit());
        home.getTahunTerbitBukuRec2().setText(RecommendedBooks.get(1).getTahunTerbit());
        home.getTahunTerbitBukuRec3().setText(RecommendedBooks.get(2).getTahunTerbit());
        home.getTahunTerbitBukuRec4().setText(RecommendedBooks.get(3).getTahunTerbit());
        home.getTahunTerbitBukuRec5().setText(RecommendedBooks.get(4).getTahunTerbit());
          
        home.getAbstrakBukuRec1().setText(RecommendedBooks.get(0).getAbstrak().substring(0,40) + "...");
        home.getAbstrakBukuRec2().setText(RecommendedBooks.get(1).getAbstrak().substring(0,40) + "...");
        home.getAbstrakBukuRec3().setText(RecommendedBooks.get(2).getAbstrak().substring(0,40) + "...");
        home.getAbstrakBukuRec4().setText(RecommendedBooks.get(3).getAbstrak().substring(0,40) + "...");
        home.getAbstrakBukuRec5().setText(RecommendedBooks.get(4).getAbstrak().substring(0,40) + "...");
        
        // Main menu admin.
        homeAdmin.getBukuRec1().setText(RecommendedBooks.get(0).getJudulBuku());
        homeAdmin.getBukuRec2().setText(RecommendedBooks.get(1).getJudulBuku());
        homeAdmin.getBukuRec3().setText(RecommendedBooks.get(2).getJudulBuku());
        homeAdmin.getBukuRec4().setText(RecommendedBooks.get(3).getJudulBuku());
        homeAdmin.getBukuRec5().setText(RecommendedBooks.get(4).getJudulBuku());
        
        homeAdmin.getTahunTerbitBukuRec1().setText(RecommendedBooks.get(0).getTahunTerbit());
        homeAdmin.getTahunTerbitBukuRec2().setText(RecommendedBooks.get(1).getTahunTerbit());
        homeAdmin.getTahunTerbitBukuRec3().setText(RecommendedBooks.get(2).getTahunTerbit());
        homeAdmin.getTahunTerbitBukuRec4().setText(RecommendedBooks.get(3).getTahunTerbit());
        homeAdmin.getTahunTerbitBukuRec5().setText(RecommendedBooks.get(4).getTahunTerbit());
          
        homeAdmin.getAbstrakBukuRec1().setText(RecommendedBooks.get(0).getAbstrak().substring(0,40) + "...");
        homeAdmin.getAbstrakBukuRec2().setText(RecommendedBooks.get(1).getAbstrak().substring(0,40) + "...");
        homeAdmin.getAbstrakBukuRec3().setText(RecommendedBooks.get(2).getAbstrak().substring(0,40) + "...");
        homeAdmin.getAbstrakBukuRec4().setText(RecommendedBooks.get(3).getAbstrak().substring(0,40) + "...");
        homeAdmin.getAbstrakBukuRec5().setText(RecommendedBooks.get(4).getAbstrak().substring(0,40) + "...");
        
        // Main menu mahasiswa.
        homeMhs.getBukuRec1().setText(RecommendedBooks.get(0).getJudulBuku());
        homeMhs.getBukuRec2().setText(RecommendedBooks.get(1).getJudulBuku());
        homeMhs.getBukuRec3().setText(RecommendedBooks.get(2).getJudulBuku());
        homeMhs.getBukuRec4().setText(RecommendedBooks.get(3).getJudulBuku());
        homeMhs.getBukuRec5().setText(RecommendedBooks.get(4).getJudulBuku());
        
        homeMhs.getTahunTerbitBukuRec1().setText(RecommendedBooks.get(0).getTahunTerbit());
        homeMhs.getTahunTerbitBukuRec2().setText(RecommendedBooks.get(1).getTahunTerbit());
        homeMhs.getTahunTerbitBukuRec3().setText(RecommendedBooks.get(2).getTahunTerbit());
        homeMhs.getTahunTerbitBukuRec4().setText(RecommendedBooks.get(3).getTahunTerbit());
        homeMhs.getTahunTerbitBukuRec5().setText(RecommendedBooks.get(4).getTahunTerbit());
          
        homeMhs.getAbstrakBukuRec1().setText(RecommendedBooks.get(0).getAbstrak().substring(0,40) + "...");
        homeMhs.getAbstrakBukuRec2().setText(RecommendedBooks.get(1).getAbstrak().substring(0,40) + "...");
        homeMhs.getAbstrakBukuRec3().setText(RecommendedBooks.get(2).getAbstrak().substring(0,40) + "...");
        homeMhs.getAbstrakBukuRec4().setText(RecommendedBooks.get(3).getAbstrak().substring(0,40) + "...");
        homeMhs.getAbstrakBukuRec5().setText(RecommendedBooks.get(4).getAbstrak().substring(0,40) + "...");
    }
    
    /*
    Method untuk verifikasi login, akan login
    sesuai dengan rolenya.
    */
    public void verifyLogin() {
        // Catat semua inputan.
        String usernameInput = login.getjTextField1().getText();
        String passwordInput = login.getjPasswordField1().getText();
        login.getjRadioButton1().setActionCommand("Mahasiswa");
        login.getjRadioButton2().setActionCommand("Admin");
        loginAs = login.getButtonGroup1().getSelection().getActionCommand(); // Tidak mungkin null karena otomatis pilih mahasiswa.
        mhsAccount = new Mahasiswa();
        adminAccount = new Admin();
        try {
            boolean hasilLogin = guestAccount.login(loginAs, 
                usernameInput, passwordInput, mhsAccount, adminAccount);
            if (hasilLogin) {
                if (loginAs == "Mahasiswa") {
                    home.setVisible(false);
                    homeMhs.getLoginAs().setText(mhsAccount.getNama() + " (Mahasiswa)");
                    login.setVisible(false);
                    homeMhs.setVisible(true);
                } else if (loginAs == "Admin") {
                    home.setVisible(false);
                    homeAdmin.getLoginAs().setText(adminAccount.getNama() + " (Admin)");
                    login.setVisible(false);
                    homeAdmin.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null,"Username atau password salah");  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Input username dan password terlebih dahulu!");
        }
    }
    
    /*
    Method untuk logout dari semua akun.
    */
    public void logoutAllAccount() {
        if (loginAs == "Mahasiswa") {
            mhsAccount.logoutAkun(mhsAccount, loginAs);
        } else if (loginAs == "Admin") {
            adminAccount.logoutAkun(guestAccount, loginAs);
        }
    }
    
    // Beberapa method navigasi.
    
    /*
    Method untuk form yang memiliki tombol back
    ke Home Menu.
    */
    public void showHomeMenu(javax.swing.JFrame page) {
        if (loginAs.equals("Mahasiswa")) {
            page.setVisible(false);
            homeMhs.setVisible(true); 
        } else if (loginAs.equals("Admin")) {
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
    public void showLoginMenu() {
        home.setVisible(false);
        login.getjTextField1().setText("regyrenanda");
        login.getjPasswordField1().setText("regy123");
        login.getjRadioButton1().setSelected(true);
        login.setVisible(true);
    }
    
    /*
    Method untuk menampilkan menu riwayat peminjaman.
    */
    public void showRiwayatPeminjamanMenu() {
        homeMhs.setVisible(false);
        TablePeminjaman table = mhsAccount.lihatRiwayat(mhsAccount.getNim());
        riwayat.getjTable1().setModel(table);
        riwayat.setVisible(true);
    }
    
    /*
    Method untuk menampilkan laman buku.
    */
    public void showBookDetails() {
        int row = listBuku.getjTable1().getSelectedRow();
        int column = 0; // Mengambil kode buku pada tabel.
        Buku newBuku = new Buku();
        try {
            newBuku = guestAccount.lihatDetailBuku(listBuku.getjTable1().getModel()
                .getValueAt(row, column).toString());
            listBuku.setVisible(false);
            detailBuku.getJudulBuku().setText("Judul : "+newBuku.getJudulBuku());
            detailBuku.getjLabel1().setText("Kode buku : "+newBuku.getKodeBuku());
            detailBuku.getjLabel2().setText("Author : "+newBuku.getAuthor());
            detailBuku.getjLabel3().setText("Tahun terbit : "+newBuku.getTahunTerbit());
            detailBuku.getjLabel4().setText("Kategori : "+newBuku.getKategoriBuku());
            detailBuku.getjLabel5().setText("Stok buku : "+newBuku.getStokBuku());
            detailBuku.getjLabel6().setText("Banyak peminjaman : "+newBuku.getFrekPeminjaman());
            detailBuku.getjLabel7().setText("Abstract : \n"+newBuku.getAbstrak());
            detailBuku.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Pilih buku terlebih dahulu!");  
        }
    }
    
    
    /*
    Method untuk melakukan search dan mengambil keyword.
    */
    public void showSearch(javax.swing.JFrame page) {
        if ((page instanceof MenuListBuku)) {
            List<Buku> hasil = new ArrayList();
            hasil = guestAccount.cariBuku(listBuku.getjTextField1().getText(), AllBook);
            TableBuku table = guestAccount.lihatDaftarBuku(hasil);
            listBuku.getjTable1().setModel(table);
        } else { 
            List<Buku> hasil = new ArrayList();
            if (page instanceof MenuHomeAdmin) {
                hasil = guestAccount.cariBuku(homeAdmin.getjTextField1().getText(), AllBook);
                homeAdmin.setVisible(false);
            } else if (page instanceof MenuHomeMahasiswa) {
                hasil = guestAccount.cariBuku(homeMhs.getjTextField1().getText(), AllBook);
                homeMhs.setVisible(false);
            } else {
                hasil = guestAccount.cariBuku(home.getjTextField1().getText(), AllBook);
                home.setVisible(false);
            }
            TableBuku table = guestAccount.lihatDaftarBuku(hasil);
            listBuku.getjTable1().setModel(table);
            listBuku.setVisible(true);
        }
    }
    
    /*
    Method untuk menampilkan laman semua buku.
    */
    public void showListBookMenu() {
        if (loginAs.equals("Admin")) {
            homeAdmin.setVisible(false);
        } else if (loginAs.equals("Mahasiswa")) {
            homeMhs.setVisible(false);
        } else {
            home.setVisible(false);
        }
        TableBuku table = guestAccount.lihatDaftarBuku(AllBook);
        
        listBuku.getjTable1().setModel(table);
        listBuku.setVisible(true);
    }
    
    /*
    Method untuk menampilkan laman buku khusus yang rekomendasi.
    */
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
        detailBuku.getjLabel7().setText("Abstract : \n"+RecommendedBooks.get(idx).getAbstrak());
        detailBuku.setVisible(true);
    }
    
    /*
    Method untuk menampilkan laman peminjaman buku.
    */
    public void showPeminjamanBukuMenu() {
        homeMhs.setVisible(false);
        peminjamanBuku.setVisible(true);
    }
    
    /*
    Method untuk menampilkan laman pengembalian buku.
    */
    public void showPengembalianBukuMenu() {
        homeMhs.setVisible(false);
        pengembalianBuku.setVisible(true);
    }
    
}
