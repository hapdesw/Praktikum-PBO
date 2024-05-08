// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 8 Mei 2024
// Deskripsi: Representasi dasar dari objek lingkaran, turunan dari kelas BangunDatar

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
}
