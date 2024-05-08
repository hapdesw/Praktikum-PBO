// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 8 Mei 2024
// Deskripsi: Driver class dengan menerapkan konsep generic

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>();

        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<>();

        bdg.set(l);
        bdg2.set(p);

        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("Tipe generic: " + bdg.get().getClass().getName());

        System.out.println("Keliling persegi: " + bdg2.hitungKeliling());
        System.out.println("Tipe generic: " + bdg2.get().getClass().getName());
    }
}
