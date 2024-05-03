// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 1 Mei 2024
// Deskripsi: Representasi dasar dari objek pegawai

public class Pegawai {
    // Atribut
    private String nama;
    private int gajiPokok = 5000000;

    // Method
    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama: " + nama + ", " + "Gaji pokok: " + gajiPokok);
    }
}
