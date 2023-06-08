/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasbesarpbo;

/**
 *
 * @author ASUS
 */
public class Buku {
    private int kodeBuku;
    private String judulBuku;
    private String author;
    private String abstrak;
    private String kategoriBuku;
    private int tahunTerbit;
    private int stokBuku;
    private int frekPeminjaman;
    
    public void tambahStokBuku(int jumlah){
        this.stokBuku += jumlah;
    }
    
    public void kurangStokBuku(int jumlah){
        this.stokBuku -= jumlah;
    }
    
    public int getKodeBuku(){
        return kodeBuku;
    }
    
    public String getJudulBuku(){
        return judulBuku;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getAbstrak(){
        return abstrak;
    }
    
    public String getkategoriBuku(){
        return kategoriBuku;
    }
    
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    
    public int getStokBuku(){
        return stokBuku;
    }
    
    public int getFrekPeminjaman(){
        return frekPeminjaman;
    }
    
    public void setStokBuku(int jumlah){
        this.stokBuku = stokBuku;
    }
    
    public void setFrekPeminjaman(){
        this.frekPeminjaman = frekPeminjaman;
    }
}
