/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan_kampus;
import model.Admin;
import perpustakaan_kampus.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ACER
 */
public class DatabaseAdmin {
    List<Admin> listAdmin;
    
    public List<Admin> getAllAdmin(){
        listAdmin = new ArrayList<>();
        Statement  statement;
        String sql = "SELECT * FROM admin";
        try {
            statement = DBConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Admin admin = new Admin();
                    admin.setKodeAdmin(result.getString("KodeAdmin"));
                    admin.setNamaLengkap(result.getString("NamaLengkap"));
                    admin.setUsername(result.getString("Username"));
                    admin.setPassword(result.getString("Password"));
                    listAdmin.add(admin);
             }
                statement.close();
            }
            return listAdmin;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseAdmin.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Admin> getAdmin(String kodeAdmin){
        listAdmin = new ArrayList<>();
        Statement  statement;
        String sql = "SELECT * FROM admin WHERE KodeAdmin = " + kodeAdmin;
        try {
            statement = DBConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Admin admin = new Admin();
                    admin.setKodeAdmin(result.getString("KodeAdmin"));
                    admin.setNamaLengkap(result.getString("NamaLengkap"));
                    admin.setUsername(result.getString("Username"));
                    admin.setPassword(result.getString("Password"));
                    listAdmin.add(admin);
             }
                statement.close();
            }
            return listAdmin;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseAdmin.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public void insertAdmin(Admin admin){
        String sql;
        sql = "INSERT INTO admin (KodeAdmin, NamaLengkap, Username, Password) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement state = DBConnection.getConnection().prepareStatement(sql);
            state.setString(1, admin.getKodeAdmin());
            state.setString(2, admin.getNamaLengkap());
            state.setString(3, admin.getUsername());
            state.setString(4, admin.getPassword());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseAdmin.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void updateAdmin(Admin admin){
        String sql;
        sql = "UPDATE admin SET KodeAdmin = ?, NamaLengkap = ?, Username = ?, Password = ?";
        try {
            PreparedStatement state = DBConnection.getConnection().prepareStatement(sql);
            state.setString(1, admin.getKodeAdmin());
            state.setString(2, admin.getNamaLengkap());
            state.setString(3, admin.getUsername());
            state.setString(4, admin.getPassword());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseAdmin.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void deleteAdmin(Admin admin){
        String sql;
        sql = "DELETE FROM admin WHERE KodeAdmin = ?";
        PreparedStatement state;
         try {
            state = DBConnection.getConnection().prepareStatement(sql);
            state.setString(1, admin.getKodeAdmin());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseAdmin.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
