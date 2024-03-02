// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 2 Maret 2024
// Deskripsi: Kelas yang berisi program class WaliMahasiswa

public class WaliMahasiswa {
    // Atribut
    private String nama;
    private String nomorHp;
    private String alamat;

    // Konstruktor
    public WaliMahasiswa(String nama, String nomorHp, String alamat){
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    // Method
    public String getNama(){
        return this.nama;
    }

    public String getNomorHp(){
        return this.nomorHp;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
