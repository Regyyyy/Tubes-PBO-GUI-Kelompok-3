/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabasePerpustakaan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import perpustakaankampus.Buku;
/**
 *
 * @author User
 */
public class DatabaseBuku {
     List<Buku> listBuku;
    
    public List<Buku> getAllBuku(){
        listBuku = new ArrayList<>();
        Statement  statement;
        String sql = "SELECT * FROM buku";
        try {
            statement = dbConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Buku buku = new Buku();
                    buku.setKodeBuku(result.getString("KodeBuku"));
                    buku.setJudulBuku(result.getString("JudulBuku"));
                    buku.setAuthor(result.getString("Penulis"));
                    buku.setKategoriBuku(result.getString("KategoriBuku"));
                    buku.setTahunTerbit(result.getString("TahunTerbit"));
                    buku.setStokBuku(result.getInt("StokBuku"));
                    buku.setFrekPeminjaman(result.getInt("frekuensi"));
                    buku.setAbstrak(result.getString("Abstrak"));
                    listBuku.add(buku);
             }
                statement.close();
            }
            return listBuku;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseBuku.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Buku> getAdmin(String kodeAdmin){
        listBuku = new ArrayList<>();
        Statement  statement;
        String sql = "SELECT * FROM admin WHERE KodeAdmin = " + kodeAdmin;
        try {
            statement = dbConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Buku buku = new Buku();
                    buku.setKodeBuku(result.getString("KodeBuku"));
                    buku.setJudulBuku(result.getString("JudulBuku"));
                    buku.setAuthor(result.getString("Penulis"));
                    buku.setKategoriBuku(result.getString("KategoriBuku"));
                    buku.setTahunTerbit(result.getString("TahunTerbit"));
                    buku.setStokBuku(result.getInt("StokBuku"));
                    buku.setFrekPeminjaman(result.getInt("frekuensi"));
                    buku.setAbstrak(result.getString("Abstrak"));
                    listBuku.add(buku);
             }
                statement.close();
            }
            return listBuku;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseBuku.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public void insertAdmin(Buku buku){
        String sql;
        sql = "INSERT INTO admin (KodeBuku, JudulBuku, Penulis, KategoriBuku, TahunTerbit, StokBuku, frekuensi, Abstrak) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement state = dbConnection.getConnection().prepareStatement(sql);
            state.setString(1, buku.getKodeBuku());
            state.setString(2, buku.getJudulBuku());
            state.setString(3, buku.getAuthor());
            state.setString(4,  buku.getKategoriBuku());
            state.setString(5,  buku.getTahunTerbit());
            state.setInt(6,  buku.getStokBuku());
            state.setInt(7,  buku.getFrekPeminjaman());
            state.setString(8, buku.getAbstrak());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void updateBuku(Buku buku){
        String sql;
        sql = "UPDATE admin SET KodeBuku = ?, JudulBuku = ?, Penulis = ?, KategoriBuku = ?, TahunTerbit = ?, StokBuku = ?, frekuensi = ?, Abstrak = ?";
        try {
            PreparedStatement state = dbConnection.getConnection().prepareStatement(sql);
            state.setString(1, buku.getKodeBuku());
            state.setString(2, buku.getJudulBuku());
            state.setString(3, buku.getAuthor());
            state.setString(4,  buku.getKategoriBuku());
            state.setString(5,  buku.getTahunTerbit());
            state.setInt(6,  buku.getStokBuku());
            state.setInt(7,  buku.getFrekPeminjaman());
            state.setString(8, buku.getAbstrak());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void deleteBuku(Buku buku){
        String sql;
        sql = "DELETE FROM buku WHERE KodeBuku = ?";
        PreparedStatement state;
         try {
            state = dbConnection.getConnection().prepareStatement(sql);
            state.setString(1, buku.getKodeBuku());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
