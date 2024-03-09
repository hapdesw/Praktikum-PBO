// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 9 Maret 2024
// Deskripsi: Kelas yang berisi program utama untuk mengaplikasikan class Product

public class MProduct {
    public static void main(String[] args){
        Product P1;
        
        P1 = new Product("Kamera", 3, 1000);
        
        // P1.setName("");
        P1.setName("Laptop");
        System.out.println("Nama produk: " + P1.getName());

        // P1.setStock(-3);
        P1.setStock(5);
        System.out.println("Stok produk: " + P1.getStock());

        // P1.setPrice(-2000);
        P1.setPrice(5000);
        System.out.println("Harga produk: " + P1.getPrice());

        // P1.purchaseProduct(8);
        // P1.purchaseProduct(5);
        // P1.purchaseProduct(-3);
        P1.purchaseProduct(2);
        System.out.println("Stok produk setelah pembelian: " + P1.getStock());

        // P1.addStock(-1);
        P1.addStock(10);
        System.out.println("Stok produk setelah penambahan stok: " + P1.getStock());
    }
}
