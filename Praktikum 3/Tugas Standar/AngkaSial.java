// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 6 Maret 2024
// Deskripsi: Program penggunaan exception buatan sendiri
//              Pengenalan klausa 'throw' dan 'throws'

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!");
        }
    }
}

// 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// Jawab: Jika terjadi eksepsi, baris 2 tidak dieksekusi karena program akan melemparkan 
//          AngkaSialException.

// 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Jawab: Dieksekusi karena baris 21 menangkap exception dari masukan angka 13 tadi.