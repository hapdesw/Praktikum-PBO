// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 1 Mei 2024
// Deskripsi: Representasi dasar dari objek mobil, turunan kelas Vehicle

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
