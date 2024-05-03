// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 1 Mei 2024
// Deskripsi: Kelas untuk menunjukkan polimorfisme ad hoc: coercion

public class Coercion{
    public static void main(String[] args) {
        // Aman
        int output = 'a';
        System.out.println(output);

        // Harus casting
        double x = 15.5;
        int output2 = (int) x;
        System.out.println(output2);

        // aman
        char y = 25;
        double output3 = y;
        System.out.println(output3);

        // aman
        int z = 78;
        char output4 = (char) z;
        System.out.println(output4);
        
        // aman
        char a = 'a';
        double output5 = a;
        System.out.println(output5);
    }
}