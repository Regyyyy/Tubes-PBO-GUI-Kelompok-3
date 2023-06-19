/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import DatabasePerpustakaan.DatabaseBuku;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Admin extends Guest implements Logout {
    private String username;
    private String password;
    private String nama;
    private String kodePustakawan;
    
    public Admin() {};
    
    public Admin(String username, String password, String nama, String kodePustakawan) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.kodePustakawan = kodePustakawan;
    }
    
    public void menambahBuku(Buku newBook) {
        DatabaseBuku bukuDao = new DatabaseBuku();
        bukuDao.insertBuku(newBook);
                    JOptionPane.showMessageDialog(null,"Berhasil menambah buku.");        

    }
    
    public void menghapusBuku() {}
    
    public void updateBuku() {}
    
    public void konfirmasiPeminjaman() {}
    
    public void konfirmasiPengembalian() {}
    
    public void membuatLaporan() {}
    
    @Override
    public void logoutAkun(Guest guest, String loginAs) {
        if (guest instanceof Admin) {
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
     * @return the kodePustakawan
     */
    public String getKodePustakawan() {
        return kodePustakawan;
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
     * @param kodePustakawan the kodePustakawan to set
     */
    public void setKodePustakawan(String kodePustakawan) {
        this.kodePustakawan = kodePustakawan;
    }
    
    
}
