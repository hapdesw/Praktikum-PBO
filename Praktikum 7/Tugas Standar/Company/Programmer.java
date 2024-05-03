// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 1 Mei 2024
// Deskripsi: Representasi dasar dari objek programmer, turunan dari kelas Pegawai

public class Programmer extends Pegawai {
    // Atribut 
    private int bonus = 450000;

    public Programmer(String nama){
        super.setNama(nama);
    }

    // Method
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }
}
