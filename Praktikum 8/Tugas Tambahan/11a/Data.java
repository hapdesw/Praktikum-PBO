// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 10 Mei 2024
// Deskripsi: Representasi dasar dari objek data dengan menerapkan konsep generic

public class Data <T> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}