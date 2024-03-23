// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 23 Maret 2024
// Deskripsi: Implementasi cara menghitung luas lingkaran

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jarijari = scan.nextDouble();

        Lingkaran l = new Lingkaran(jarijari);
        
        System.out.println("Luas lingkaran dengan jari-jari " + jarijari + " adalah " + l.hitungLuas());

        scan.close();
    }
}
