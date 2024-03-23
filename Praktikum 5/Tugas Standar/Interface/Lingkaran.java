// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 23 Maret 2024
// Deskripsi: Kelas implementasi IArea berupa cara menghitung luas lingkaran

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    private double jarijari;

    public Lingkaran(double r){
        jarijari = r;
    }

    public double hitungLuas(){
        return PI * jarijari * jarijari;
    }
}
