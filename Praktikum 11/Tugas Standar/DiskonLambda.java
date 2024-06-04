// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 29 Mei 2024

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {
        // Tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        // Dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // Dengan lambda dengan block statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdekaa: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}