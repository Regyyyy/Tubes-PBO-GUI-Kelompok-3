/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabasePerpustakaan;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import perpustakaankampus.Admin;
import perpustakaankampus.Buku;
import perpustakaankampus.Mahasiswa;
/**
 *
 * @author User
 */
public class DatabaseMember {
    List<Mahasiswa> listMahasiswa;
    List<Admin> listAdmin;
    
    public List<Mahasiswa> getAllMahasiswa(){
        listMahasiswa = new ArrayList<>();
        Statement statement;
        String sql = "SELECT * FROM mahasiswa";
        
        try {
            statement = dbConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Mahasiswa mhs = new Mahasiswa();
                    mhs.setNim(result.getString("NIM"));
                    mhs.setNama(result.getString("NamaLengkap"));
                    mhs.setUsername(result.getString("Username"));
                    mhs.setPassword(result.getString("Password"));
                    
                    listMahasiswa.add(mhs);
             }
                statement.close();
            }
            return listMahasiswa;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseMember.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Mahasiswa> getMahasiswa(String username){
        listMahasiswa = new ArrayList<>();
        Statement statement;
        String sql = "SELECT * FROM mahasiswa WHERE Username = '" + username + "'";
        
        try {
            statement = dbConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Mahasiswa mhs = new Mahasiswa();
                    mhs.setNim(result.getString("NIM"));
                    mhs.setNama(result.getString("NamaLengkap"));
                    mhs.setUsername(result.getString("Username"));
                    mhs.setPassword(result.getString("Password"));
                    
                    listMahasiswa.add(mhs);
             }
                statement.close();
            }
            return listMahasiswa;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseMember.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Admin> getAllAdmin(){
        listAdmin = new ArrayList<>();
        Statement statement;
        String sql = "SELECT * FROM admin";
        
        try {
            statement = dbConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Admin adm = new Admin();
                    adm.setKodePustakawan(result.getString("KodeAdmin"));
                    adm.setNama(result.getString("NamaLengkap"));
                    adm.setUsername(result.getString("Username"));
                    adm.setPassword(result.getString("Password"));
                    
                    listAdmin.add(adm);
             }
                statement.close();
            }
            return listAdmin;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseMember.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Admin> getAdmin(String username){
        listAdmin = new ArrayList<>();
        Statement statement;
        String sql = "SELECT * FROM admin WHERE Username = '" + username + "'";
        
        try {
            statement = dbConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Admin adm = new Admin();
                    adm.setKodePustakawan(result.getString("KodeAdmin"));
                    adm.setNama(result.getString("NamaLengkap"));
                    adm.setUsername(result.getString("Username"));
                    adm.setPassword(result.getString("Password"));
                    
                    listAdmin.add(adm);
             }
                statement.close();
            }
            return listAdmin;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseMember.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}
