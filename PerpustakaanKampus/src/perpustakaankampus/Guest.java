/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import Komparasi.ComparatorFrekuensi;
import java.util.*;

/**
 *
 * @author User
 */
public class Guest {
    public Guest() {}
    
    public void lihatDaftarBuku() {
        //Perlu akses ke class DatabaseBuku
    }
    
    /*
    Method untuk melakukan login
    */
    public boolean login(String pilihan) {
        //perlu akses ke class DatabaseMember
        return true;
    }
    
    public void cariBuku() {
        //Perlu akses ke class Buku
    }
    
    public void lihatDetailBuku() {
        //Perlu akses ke class Riwayat
    }
    
    public List<Buku> lihatRekomendasiBuku() {
        // Misalkan menggunakan class DatabaseBuku untuk mengembalikan semua buku pada database
        // Buku(int kodeBuku, String judulBuku, String author, String abstrak, String kategoriBuku, int tahunTerbit, int stokBuku)
        // Di bawah ini hanya untuk demo
        List<Buku> listBuku = new ArrayList();
        List<Buku> newListBuku = new ArrayList();
        listBuku.add(new Buku("B001", "Good to Great: Why Some Compan", "Jim Collins", "Dalam buku ini, Collins menganalisis perusahaan-perusahaan yang berhasil bertransformasi dari yang baik menjadi luar biasa. Dengan menggunakan penelitian yang mendalam, dia mengidentifikasi pola-pola ", "Bisnis", "2001", 5, 10));
        listBuku.add(new Buku("B002", "Lean In: Women, Work", "Blake Masters", "Sandberg, Chief Operating Officer Facebook, mengajak wanita untuk mengambil peran aktif dalam dunia kerja dan memperjuangkan kesetaraan gender. Dia membahas tantangan yang dihadapi oleha wanita di tempat", "2013", "2001", 5, 4));
        listBuku.add(new Buku("B003", "The 7 Habits", "Stephen R. Covey", "Covey mengidentifikasi tujuh kebiasaan yang dimiliki oleh orang-orang yang sangat efektif dalam hidup dan bisnis. Dari kebiasaan mengutamakan hal-hal penting hingga berusaha memahami terlebih dahulu saja.", "Bisnis", "1989", 5, 8));
        listBuku.add(new Buku("B004", "Zero to One", "Blake Masters", "Zero to One (2014) mengungkap cara membangun sebuah perusahaan startup sukses yang mampu menjawab tantangan masa depan yang penuh dengan ketidakpastian. Di dalam buku ini Anda juga akan mempelajari prinsip-prinsip yang harus dimiliki oleh sebuah peru", "Bisnis", "2014", 5, 16));
        listBuku.add(new Buku("B005", "The Monk and The Riddle", "Randy Komisar", "\\\"The Monk and the Riddle\\\" adalah sebuah buku yang mengisahkan perjalanan hidup seorang pengusaha sukses yang mencari arti sejati dalam hidupnya. Cerita ini mengungkapkan konflik antara keinginan untuk menghasilkan keuntungan finansial dan kepuasan pr", "Bisnis", "2000", 5, 3));
        listBuku.add(new Buku("B006", "To Kill a Mockingbird", "Harper Lee", "\\\"To Kill a Mockingbird\\\" adalah sebuah novel klasik yang ditulis oleh Harper Lee.\\", "Bisnis", "1960", 5, 7));
        
        Collections.sort(listBuku, new ComparatorFrekuensi());
//        Collections.sort(listBuku, Comparator.reverseOrder());
        
        for (int i = 0; i < 5; i++) {
            newListBuku.add(listBuku.get(i));
        }
        
        return newListBuku;
    }
}
