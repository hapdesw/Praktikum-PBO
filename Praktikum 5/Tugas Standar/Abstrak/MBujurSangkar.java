// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 23 Maret 2024
// Deskripsi: Kelas yang mengimplementasikan cara menghitung luas bujur sangkar

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " adalah " + bs.hitungLuas(sisi));

        scan.close();
    }
}

// Apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar? Jelaskan! 
// Jawab: Jika BujurSangkar tidak ada implementasi metode abstrak dari BangunDatar, maka akan terjadi error. Di kelas abstract hanya ada deklarasi, tidak ada blok kode implementasi. Jadi, subclass, yaitu BujurSangkar, harus mengimplementasikan method hitungLuas yang ada di BangunDatar.