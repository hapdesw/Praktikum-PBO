// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 8 Mei 2024
// Deskripsi: program penggunaan objek ArrayList sebagai collection class

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("hermione");
        strings.add("lucy");
        strings.add("arrietty");

        strings.remove("lucy");

        for(String s: strings){
            System.out.print(s + " ");
        }
    }
}
