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
    private List<Buku> RekomendasiBuku;
    
    public ControllerApp(MenuHome home) {
        // Pembuatan objek semua menu.
        this.home = home;
        login = new MenuLogin(this);
        riwayat = new MenuRiwayatPeminjaman(this);
        homeMhs = new MenuHomeMahasiswa(this);
        homeAdmin = new MenuHomeAdmin(this);
        
        // Pembuatan semua class database.
        dbBuku = new DatabaseBuku();
        dbMember = new DatabaseMember();
        dbPeminjaman = new DatabaseRiwayatPeminjaman();
        
        // Pembuatan variable user.
        guestAccount = new Guest();
    }
    
    /*
    Method untuk menampilkan menu login.
    */
    public void showLoginMenu() {
        home.setVisible(false);
        login.getjTextField1().setText("");
        login.getjPasswordField1().setText("");
        login.getjRadioButton1().setSelected(true);
        login.setVisible(true);
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
        
        try {
            if (login.getButtonGroup1().getSelection().getActionCommand().equals("Mahasiswa")) {
            
                // Mahasiswa newMhs = DatabaseMember.cariMahasiswa();

                // Demo.
                if (usernameInput.equals("regy") && passwordInput.equals("1234")) {
                    mhsAccount = new Mahasiswa("regy","1234","Regy Renanda Rahman","1302213117");
                    home.setVisible(false);
                    homeMhs.getLoginAs().setText(mhsAccount.getNama() + " (Mahasiswa)");
                    homeMhs.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Username atau password salah");  
                }
                
            } else if (login.getButtonGroup1().getSelection().getActionCommand().equals("Admin")) {
                if (usernameInput.equals("herlin") && passwordInput.equals("5678")) {
                    adminAccount = new Admin("herlin","5678","Herlin Priatna","p-52");
                    home.setVisible(false);
                    homeAdmin.getLoginAs().setText(adminAccount.getNama() + " (Admin)");
                    homeAdmin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Username atau password salah");  
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Akun tidak terdaftar");
        }
        
    }
    
    /*
    Method untuk logout dari semua akun.
    */
    public void logoutAllAccount() {
        mhsAccount = null;
        adminAccount = null;
    }
    
    // Beberapa method navigasi.
    
    /*
    Method untuk form yang memiliki tombol back
    ke Home Menu.
    */
    public void showHomeMenu(NextToHome page) {
        if (page instanceof MenuLogin) {
            login.setVisible(false);
            home.setVisible(true);  
        } else if (page instanceof MenuHomeMahasiswa) {
            homeMhs.setVisible(false);
            home.setVisible(true);
        } else if (page instanceof MenuHomeAdmin) {
            homeAdmin.setVisible(false);
            home.setVisible(true);
        }
    }
    
    
}
