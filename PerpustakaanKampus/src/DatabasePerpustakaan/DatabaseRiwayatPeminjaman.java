/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabasePerpustakaan;

//import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import perpustakaankampus.Peminjaman;

/**
 *
 * @author User
 */
public class DatabaseRiwayatPeminjaman {
    List<Peminjaman> listPeminjaman;
    public List<Peminjaman> getAllPeminjaman(){
        listPeminjaman = new ArrayList<>();
        Statement  statement;
        String sql = "SELECT * FROM riwayat_peminjaman";
        try {
            statement = dbConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Peminjaman peminjaman = new Peminjaman();
                    peminjaman.setIdPeminjaman(result.getString("IDPeminjaman"));
                    peminjaman.setNim(result.getString("NIM"));
                    peminjaman.setKodeBuku(result.getString("KodeBuku"));
                    peminjaman.setJudulBuku(result.getString("JudulBuku"));
                    peminjaman.setTanggalPinjam(result.getDate("TanggalPinjam").toLocalDate());
                    peminjaman.setBatasPinjam(result.getDate("BatasPinjam").toLocalDate());
                    peminjaman.setDisetujui(result.getBoolean("Disetujui"));
                    peminjaman.setSelesai(result.getBoolean("Selesai"));
                    peminjaman.setDenda(result.getInt("Denda"));
                    peminjaman.setKondisiBuku(result.getString("KondisiBuku"));
                    listPeminjaman.add(peminjaman);
             }
                statement.close();
            }
            return listPeminjaman;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseRiwayatPeminjaman.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Peminjaman> getPeminjaman(String NIM){
        listPeminjaman = new ArrayList<>();
        Statement  statement;
        String sql = "SELECT * FROM riwayat_peminjaman WHERE NIM = " + NIM;
        try {
            statement = dbConnection.getConnection().createStatement();
            
            try (ResultSet result = statement.executeQuery(sql)){
                while (result.next()){
                    Peminjaman peminjaman = new Peminjaman();
                    peminjaman.setIdPeminjaman(result.getString("IDPeminjaman"));
                    peminjaman.setNim(result.getString("NIM"));
                    peminjaman.setKodeBuku(result.getString("KodeBuku"));
                    peminjaman.setJudulBuku(result.getString("JudulBuku"));
                    peminjaman.setTanggalPinjam(result.getDate("TanggalPinjam").toLocalDate());
                    peminjaman.setBatasPinjam(result.getDate("BatasPinjam").toLocalDate());
                    peminjaman.setDisetujui(result.getBoolean("Disetujui"));
                    peminjaman.setSelesai(result.getBoolean("Selesai"));
                    peminjaman.setDenda(result.getInt("Denda"));
                    peminjaman.setKondisiBuku(result.getString("KondisiBuku"));
                    listPeminjaman.add(peminjaman);
             }
                statement.close();
            }
            return listPeminjaman;
        } catch (SQLException e) {
            Logger.getLogger(DatabaseRiwayatPeminjaman.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public void updatePeminjaman(Peminjaman peminjaman){
        String sql;
        sql = "UPDATE riwayat_peminjaman SET IDPeminjaman = ?, NIM = ?, KodeBuku = ?, JudulBuku = ?, TanggalPinjam = ?, BatasPinjam = ?, Disetujui = ?, Selesai = ?, Denda = ?, KondisiBuku = ?";
        try {
            PreparedStatement state = dbConnection.getConnection().prepareStatement(sql);
            state.setString(1, peminjaman.getIdPeminjaman());
            state.setString(2, peminjaman.getNim());
            state.setString(3, peminjaman.getKodeBuku());
            state.setString(4,  peminjaman.getJudulBuku());
//            Date date = peminjaman.getTanggalPinjam();
//            LocalDate localdate = date.toInstant()
//      .atZone(ZoneId.systemDefault())
//      .toLocalDate();
            state.setDate(5, java.sql.Date.valueOf(peminjaman.getTanggalPinjam()));
            state.setDate(6, java.sql.Date.valueOf(peminjaman.getBatasPinjam()));
            state.setBoolean(7,  peminjaman.isDisetujui());
            state.setBoolean(8, peminjaman.isSelesai());
            state.setInt(9, peminjaman.getDenda());
            state.setString(10, peminjaman.getKondisiBuku());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void addPeminjaman(Peminjaman peminjaman){
        String sql = "INSERT INTO riwayat_peminjaman (IDPeminjaman, NIM, KodeBuku, JudulBuku, TanggalPinjam, BatasPinjam, Disetujui, Selesai, Denda, KondisiBuku) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement state = dbConnection.getConnection().prepareStatement(sql);
            state.setString(1, peminjaman.getIdPeminjaman());
            state.setString(2, peminjaman.getNim());
            state.setString(3, peminjaman.getKodeBuku());
            state.setString(4,  peminjaman.getJudulBuku());
            state.setDate(5, java.sql.Date.valueOf(peminjaman.getTanggalPinjam()));
            state.setDate(6, java.sql.Date.valueOf(peminjaman.getBatasPinjam()));
            state.setBoolean(7,  peminjaman.isDisetujui());
            state.setBoolean(8, peminjaman.isSelesai());
            state.setInt(9, peminjaman.getDenda());
            state.setString(10, peminjaman.getKondisiBuku());
            
            state.executeUpdate();
            
            
        } catch (SQLException e) {
            Logger.getLogger(DatabaseBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
