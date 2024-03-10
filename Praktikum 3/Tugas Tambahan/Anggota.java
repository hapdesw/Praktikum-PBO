// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 9 Maret 2024
// Deskripsi: Kelas yang berisi program class Anggota

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return this.nama;
    }

    public Buku[] getBukuPinjaman() {
        return this.bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return this.jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException{
        if (getJumlahBukuPinjaman() >= 3){
            throw new MaksimumBukuTerpinjamException("Jumlah buku yang dipinjam tidak boleh lebih dari 3");
        }
        if (buku.isTersedia() == false){
            throw new BukuTidakTersediaException("Buku tidak tersedia");
        }
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }
}
