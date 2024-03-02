// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 2 Maret 2024
// Deskripsi: Kelas yang berisi program class Mahasiswa

public class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    // Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    // Method
    public String getNama(){
        return this.nama;
    }

    public String getNim(){
        return this.nim;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public WaliMahasiswa getWali(){
        return this.wali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("NIM mahasiswa: " + nim);
        System.out.println("Jurusan mahasiswa: " + jurusan);
        System.out.println("Nama wali mahasiswa: " + wali.getNama());
        System.out.println("Nomor HP wali mahasiswa: " + wali.getNomorHp());
        System.out.println("Alamat wali mahasiswa: " + wali.getAlamat());
    }
}