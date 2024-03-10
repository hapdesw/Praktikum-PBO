// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 9 Maret 2024
// Deskripsi: Eksepsi buatan sendiri, mencegah buku yang tidak tersedia dipinjam

public class BukuTidakTersediaException extends Exception{
    public BukuTidakTersediaException(String message) {
        super(message);
    }
}