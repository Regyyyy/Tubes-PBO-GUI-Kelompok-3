/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan_kampus;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mahasiswa;

/**
 *
 * @author ACER
 */
public class DatabaseMahasiswa {
    List<Mahasiswa> listMahasiswa;
    
    public List<Mahasiswa> getAllMahasiswa(){
        listMahasiswa = new ArrayList<>();
        Statement  statement;
        String sql = "SELECT * FROM mahasiswa";
        try {
            statement = DBConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Mahasiswa mhs = new Mahasiswa();
                    mhs.setNIM(result.getString("NIM"));
                    mhs.setNamaLengkap(result.getString("NamaLengkap"));
                    mhs.setUsername(result.getString("Username"));
                    mhs.setPassword(result.getString("Password"));
                    listMahasiswa.add(mhs);
             }
                statement.close();
            }
            return listMahasiswa;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseMahasiswa.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Mahasiswa> getMahasiswa(String nim){
        listMahasiswa = new ArrayList<>();
        Statement  statement;
        String sql = "SELECT * FROM mahasiswa WHERE NIM = " + nim;
        try {
            statement = DBConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Mahasiswa mhs = new Mahasiswa();
                    mhs.setNIM(result.getString("NIM"));
                    mhs.setNamaLengkap(result.getString("NamaLengkap"));
                    mhs.setUsername(result.getString("Username"));
                    mhs.setPassword(result.getString("Password"));
                    listMahasiswa.add(mhs);
             }
                statement.close();
            }
            return listMahasiswa;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseMahasiswa.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public void insertAdmin(Mahasiswa mhs){
        String sql;
        sql = "INSERT INTO mahasiswa (NIM, NamaLengkap, Username, Password) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement state = DBConnection.getConnection().prepareStatement(sql);
            state.setString(1, mhs.getNIM());
            state.setString(2, mhs.getNamaLengkap());
            state.setString(3, mhs.getUsername());
            state.setString(4, mhs.getPassword());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseMahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void updateAdmin(Mahasiswa mhs){
        String sql;
        sql = "UPDATE admin SET NIM = ?, NamaLengkap = ?, Username = ?, Password = ?";
        try {
            PreparedStatement state = DBConnection.getConnection().prepareStatement(sql);
            state.setString(1, mhs.getNIM());
            state.setString(2, mhs.getNamaLengkap());
            state.setString(3, mhs.getUsername());
            state.setString(4, mhs.getPassword());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseMahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void deleteAdmin(Mahasiswa mhs){
        String sql;
        sql = "DELETE FROM mahasiswa WHERE NIM = ?";
        PreparedStatement state;
         try {
            state = DBConnection.getConnection().prepareStatement(sql);
            state.setString(1, mhs.getNIM());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseMahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
