// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 10 Mei 2024
// Deskripsi: Driver class dengan menerapkan konsep generic

public class Main {
    public static void main(String[] args) {
        // kamus
        Ulat K;
        Data<Kupu> anu;
        
        // algoritma
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}
