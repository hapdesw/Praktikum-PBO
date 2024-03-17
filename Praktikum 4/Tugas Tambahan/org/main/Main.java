// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 17 Maret 2024
// Deskripsi: Driver class untuk orang, walimahasiswa, dan mahasiswa

package org.main;

import org.walimahasiswa.*;
import org.mahasiswa.*;

public class Main {
    public static void main(String[] args){
        Mahasiswa M1;
        Mahasiswa M2;

        WaliMahasiswa WM1;
        WaliMahasiswa WM2;

        // Wali Mahasiswa 1
        System.out.println("------------ Wali Mahasiswa ------------");
        WM1 = new WaliMahasiswa("Somat", "97548136", "08258", "Kampung Bhinneka Tunggal Ika");
        WM1.cetak();
        System.out.println();

        // Mahasiswa 1
        System.out.println("------------ Mahasiswa ------------");
        M1 = new Mahasiswa("Dudung", "48512367", "123456", "Sastra Indonesia", WM1);
        M1.cetak();
        System.out.println();

        // Wali Mahasiswa 2
        WM2 = new WaliMahasiswa("Fatimah", "65713294", "08149", "Kampung Betawi");

        // Mahasiswa 2
        System.out.println("------------ Mahasiswa ------------");
        M2 = new Mahasiswa("Entong", "24951387", "987654", "Teknik Arsitektur", WM2);
        M2.cetak();
    }
}
