// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 16 Maret 2024
// Deskripsi: Representasi dasar dari objek persegi panjang, turunan kelas poligon

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun persegi panjang mempunyai " + this.getJumlahSisi() + " sisi");
    }
}
