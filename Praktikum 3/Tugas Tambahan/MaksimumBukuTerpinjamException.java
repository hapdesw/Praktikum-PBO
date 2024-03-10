// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 9 Maret 2024
// Deskripsi: Eksepsi buatan sendiri, mencegah jumlah buku yang dipinjam melebihi 3 

public class MaksimumBukuTerpinjamException extends Exception{
    public MaksimumBukuTerpinjamException(String message) {
        super(message);
    }
}