// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 9 Maret 2024
// Deskripsi: Kelas yang berisi program class Product

public class Product {
    private String name;
    private int stock;
    private int price;

    public Product() {
        this.name = "";
        this.stock = 0;
        this.price = 0;
    }

    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getStock() {
        return this.stock;
    }

    public int getPrice() {
        return this.price;
    }

    public void setName(String name) {
        if (name.equals("")){
            assert (!name.equals("")): "Terdapat kesalahan. Nama produk tidak boleh kosong";
        } 
        else{
            this.name = name;
        }
    }

    public void setStock(int stock) {
        if (stock < 0){
            assert (stock >= 0): "Terdapat kesalahan. Jumlah stock tidak boleh bilangan negatif";
        }
        else{
            this.stock = stock;
        }
    }

    public void setPrice(int price) {
        if (price <= 0){
            assert (price > 0): "Terdapatkesalahan. Harga produk harus bilangan positif";
        }
        else{
            this.price = price;
        }
    }

    public void purchaseProduct(int quantity) {
        if (quantity <= 0){
            assert (quantity > 0): "Terjadi kesalahan. Quantity barang yang dibeli harus bilangan positif";
        }
        else{
            if (getStock() < quantity){
                assert (getStock() >= quantity): "Terjadi kesalahan. Stok produk yang tersedia tidak mencukupi";
            }
            else{
                this.stock = this.stock - quantity;
            }
        }
    }

    public void addStock(int quantity) {
        if (quantity <= 0){
            assert (quantity > 0): "Terjadi kesalahan. Quantity barang harus bilangan positif";
        }
        else{
            this.stock = this.stock + quantity;
        }
    }
}
