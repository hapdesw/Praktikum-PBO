// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 6 Maret 2024
// Deskripsi: Kelas yang berisi program untuk menunjukkan asersi

public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if (x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert (x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
