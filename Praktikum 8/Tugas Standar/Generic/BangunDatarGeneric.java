// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 8 Mei 2024
// Deskripsi: Representasi dasar dari objek bangun datar dengan menerapkan konsep generic

public class BangunDatarGeneric <T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
