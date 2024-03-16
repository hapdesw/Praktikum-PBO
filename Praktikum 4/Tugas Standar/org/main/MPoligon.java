// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 16 Maret 2024
// Deskripsi: Driver class untuk poligon, persegi panjang, dan segitiga

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        // Persegi panjang
        PersegiPanjang persegi = new PersegiPanjang(12, 12, 4);
        
        persegi.printInfo();
        System.out.println("Luas persegi panjang: " + persegi.hitungLuas());
        System.out.println();

        // Segitiga
        Segitiga s = new Segitiga(14, 12, 3);

        s.printInfo();
        System.out.println("Luas segitiga: " + s.hitungLuas());
    }
}
