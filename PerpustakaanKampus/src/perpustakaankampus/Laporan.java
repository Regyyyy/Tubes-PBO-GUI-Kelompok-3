/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import DatabasePerpustakaan.DatabaseRiwayatPeminjaman;
import java.util.*;

/**
 *
 * @author User
 */
public class Laporan {
    private String bulan;
    private List<Peminjaman> dataPeminjaman;
    
    public Laporan(String bulan) {
        this.bulan = bulan;
        DatabaseRiwayatPeminjaman peminjamanDao = new DatabaseRiwayatPeminjaman();
        dataPeminjaman = peminjamanDao.getAllPeminjaman();
    }
    
    public List<Peminjaman> printLaporan() {
        return dataPeminjaman;
    }
}
