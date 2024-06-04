// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 29 Mei 2024

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Budi");
        mahasiswaList.add("Cahyadi");
        mahasiswaList.add("Dodi");

        // Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
