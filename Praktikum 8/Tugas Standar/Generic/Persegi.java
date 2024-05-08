// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 8 Mei 2024
// Deskripsi: Representasi dasar dari objek persegi, turunan dari  kelas BangunDatar

public class Persegi extends BangunDatar{
    private int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    public double hitungKeliling(){
        return ((double)sisi * 4);
    }
}
