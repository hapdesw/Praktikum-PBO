// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 1 Mei 2024
// Deskripsi: Driver class untuk Vehicle, Car, dan Bus

public class Main {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}
