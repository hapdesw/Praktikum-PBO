// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 9 Maret 2024
// Deskripsi: Kelas yang berisi program class Buku

public class Buku {
    private String judul;
    private boolean tersedia;

    public Buku(String judul) {
        this.judul = judul;
        tersedia = true;
    }

    public String getJudul() {
        return this.judul;
    }

    public boolean isTersedia() {
        return this.tersedia;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
