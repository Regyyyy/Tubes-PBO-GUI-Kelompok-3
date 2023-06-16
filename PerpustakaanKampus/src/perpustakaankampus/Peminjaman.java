/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

/**
 *
 * @author User
 */
public class Peminjaman {
    private String NIM;
    private String IDPeminjaman, KodeBuku, JudulBuku;
    private String tanggalPinjam, batasPinjam;
    private boolean disetujui;
    private boolean selesai;
    private int denda;
    private String kondisiBuku;
    
    public Peminjaman(){};
    public Peminjaman(String KodeBuku, String IDPeminjaman, String judul, String batas, String tanggalPinjam) {
        this.IDPeminjaman = IDPeminjaman;
        this.KodeBuku = KodeBuku;
        this.JudulBuku = judul;
        this.tanggalPinjam = tanggalPinjam;
        this.batasPinjam = batas;
        this.disetujui = false;
        this.selesai = false;
        this.denda = 0;
        this.kondisiBuku = "bagus";
    }

    /**
     * @return the NIM
     */
    public String getNIM() {
        return NIM;
    }

    /**
     * @param NIM the NIM to set
     */
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    /**
     * @return the IDPeminjaman
     */
    public String getIDPeminjaman() {
        return IDPeminjaman;
    }

    /**
     * @param IDPeminjaman the IDPeminjaman to set
     */
    public void setIDPeminjaman(String IDPeminjaman) {
        this.IDPeminjaman = IDPeminjaman;
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
     * @return the tanggalPinjam
     */
    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    /**
     * @param tanggalPinjam the tanggalPinjam to set
     */
    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    /**
     * @return the batasPinjam
     */
    public String getBatasPinjam() {
        return batasPinjam;
    }

    /**
     * @param batasPinjam the batasPinjam to set
     */
    public void setBatasPinjam(String batasPinjam) {
        this.batasPinjam = batasPinjam;
    }

    /**
     * @return the disetujui
     */
    public boolean isDisetujui() {
        return disetujui;
    }

    /**
     * @param disetujui the disetujui to set
     */
    public void setDisetujui(boolean disetujui) {
        this.disetujui = disetujui;
    }

    /**
     * @return the selesai
     */
    public boolean isSelesai() {
        return selesai;
    }

    /**
     * @param selesai the selesai to set
     */
    public void setSelesai(boolean selesai) {
        this.selesai = selesai;
    }

    /**
     * @return the denda
     */
    public int getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(int denda) {
        this.denda = denda;
    }

    /**
     * @return the kondisiBuku
     */
    public String getKondisiBuku() {
        return kondisiBuku;
    }

    /**
     * @param kondisiBuku the kondisiBuku to set
     */
    public void setKondisiBuku(String kondisiBuku) {
        this.kondisiBuku = kondisiBuku;
    }


    
}
