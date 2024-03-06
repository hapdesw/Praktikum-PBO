// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 6 Maret 2024
// Deskripsi: Program penggunaan eksepsi menggunakan class library Java

public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exception){
            // exception.printStackTrace();
            System.out.println("Index melebihi batas");
        }
        finally{
            System.out.println("Clean up code...");
        }
    }
}
