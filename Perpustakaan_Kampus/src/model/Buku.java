/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Buku {
    private String KodeBuku, JudulBuku, Penulis, KategoriBuku, TahunTerbit, Abstrak;
    private int StokBuku, Frekuensi;
    
    public Buku(){
        
    }
    
    public Buku(String kode, String judul,String penulis, String kategori, String tahun, int stok, int frek, String abstrak){
        this.KodeBuku = kode;
        this.JudulBuku = judul;
        this.Penulis = penulis;
        this.KategoriBuku = kategori;
        this.TahunTerbit = tahun;
        this.StokBuku = stok;
        this.Frekuensi = frek;
        this.Abstrak = abstrak;
    }

    /**
     * @return the KodeBuku
     */
    public String getKodeBuku() {
        return KodeBuku;
    }

    /**
     * @param KodeBuku the KodeBuku to set
     */
    public void setKodeBuku(String KodeBuku) {
        this.KodeBuku = KodeBuku;
    }

    /**
     * @return the JudulBuku
     */
    public String getJudulBuku() {
        return JudulBuku;
    }

    /**
     * @param JudulBuku the JudulBuku to set
     */
    public void setJudulBuku(String JudulBuku) {
        this.JudulBuku = JudulBuku;
    }

    /**
     * @return the Penulis
     */
    public String getPenulis() {
        return Penulis;
    }

    /**
     * @param Penulis the Penulis to set
     */
    public void setPenulis(String Penulis) {
        this.Penulis = Penulis;
    }

    /**
     * @return the KategoriBuku
     */
    public String getKategoriBuku() {
        return KategoriBuku;
    }

    /**
     * @param KategoriBuku the KategoriBuku to set
     */
    public void setKategoriBuku(String KategoriBuku) {
        this.KategoriBuku = KategoriBuku;
    }

    /**
     * @return the TahunTerbit
     */
    public String getTahunTerbit() {
        return TahunTerbit;
    }

    /**
     * @param TahunTerbit the TahunTerbit to set
     */
    public void setTahunTerbit(String TahunTerbit) {
        this.TahunTerbit = TahunTerbit;
    }

    /**
     * @return the Abstrak
     */
    public String getAbstrak() {
        return Abstrak;
    }

    /**
     * @param Abstrak the Abstrak to set
     */
    public void setAbstrak(String Abstrak) {
        this.Abstrak = Abstrak;
    }

    /**
     * @return the StokBuku
     */
    public int getStokBuku() {
        return StokBuku;
    }

    /**
     * @param StokBuku the StokBuku to set
     */
    public void setStokBuku(int StokBuku) {
        this.StokBuku = StokBuku;
    }

    /**
     * @return the Frekuensi
     */
    public int getFrekuensi() {
        return Frekuensi;
    }

    /**
     * @param Frekuensi the Frekuensi to set
     */
    public void setFrekuensi(int Frekuensi) {
        this.Frekuensi = Frekuensi;
    }
    
    
    
}
