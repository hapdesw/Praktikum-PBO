// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 8 Mei 2024
// Deskripsi: program yang menggunakan Generic untuk pasangan Kunci-Nilai

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");

        System.out.println(map.get(1));

        Set<Integer> keys =  map.keySet();
        for (Integer key: keys){
            System.out.println(map.get(key));
        }
    }
}
