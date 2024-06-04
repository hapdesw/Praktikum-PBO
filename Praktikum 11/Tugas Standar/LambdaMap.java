// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 29 Mei 2024

import java.util.Map;
import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("12345", "Adi");
        mahasiswaMap.put("23456", "Budi");
        mahasiswaMap.put("34567", "Cahyadi");
        mahasiswaMap.put("45678", "Dodi");

        // Lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", " + "Nama: " + nama));
    }
}
