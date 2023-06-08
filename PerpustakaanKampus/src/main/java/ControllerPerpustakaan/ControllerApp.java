/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerPerpustakaan;

import DatabasePerpustakaan.DatabaseBuku;
import DatabasePerpustakaan.DatabaseMember;
import DatabasePerpustakaan.DatabaseRiwayatPeminjaman;
import GUIPerpustakaan.MenuHome;
import GUIPerpustakaan.MenuLogin;
import GUIPerpustakaan.MenuRiwayatPeminjaman;
import GUIPerpustakaan.NextToHome;
import com.mycompany.perpustakaankampus.Admin;
import com.mycompany.perpustakaankampus.Guest;
import com.mycompany.perpustakaankampus.Mahasiswa;

/**
 *
 * @author User
 */
public class ControllerApp {
    // Declare semua menu
    private MenuHome home;
    private MenuLogin login;
    private MenuRiwayatPeminjaman riwayat;
    
    // Declare semua class database
    private DatabaseBuku dbBuku;
    private DatabaseMember dbMember;
    private DatabaseRiwayatPeminjaman dbPeminjaman;
    
    // Declare variable user
    private String loginAs; // Mengetahui login sebagai role apa
    private Guest guestAccount; // Default ketika masuk ke app
    private Mahasiswa mhsAccount; // Objek ketika login as mahasiswa
    private Admin adminAccount; // Objek ketka login as admin
    
    public ControllerApp(MenuHome home) {
        // Pembuatan objek semua menu
        this.home = home;
        login = new MenuLogin(this);
        riwayat = new MenuRiwayatPeminjaman();
        
        // Pembuatan semua class database
        dbBuku = new DatabaseBuku();
        dbMember = new DatabaseMember();
        dbPeminjaman = new DatabaseRiwayatPeminjaman();
        
        // Pembuatan variable user
        guestAccount = new Guest();
    }
    
    public void showLoginMenu() {
        home.setVisible(false);
        login.setVisible(true);
    }
    
    public void verifLogin() {
        
    }
    
    /*
    Method untuk form yang memiliki tombol back
    ke Home Menu
    */
    public void showHomeMenuFromLogin(NextToHome page) {
        if (page instanceof MenuLogin) {
            login.setVisible(false);
            home.setVisible(true);  
        }
    }
    
    public void loginMahasiswa() {
        //test
    }
}
