// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 1 Mei 2024
// Deskripsi: Representasi dasar dari objek manajer, turunan dari kelas Pegawai

public class Manajer extends Pegawai {
    // Atribut 
    private int tunjangan = 700000;

    // Konstruktor
    public Manajer(String nama){
        super.setNama(nama);
    }

    // Method
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
