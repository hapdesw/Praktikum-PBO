// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 9 Maret 2024
// Deskripsi: Kelas yang berisi program utama untuk mengaplikasikan class Buku dan class Anggota dengan exception 
//              BukuTidakTersediaException dan MaksimumBukuTerpinjamException

public class Main {
    public static void main(String[] args){
        Buku B1;
        Buku B2;
        Buku B3;
        Buku B4;
        Buku B5;

        Anggota A1;
        Anggota A2;

        B1 = new Buku("Harry Potter and the Sorcerer's Stone");
        B2 = new Buku("Harry Potter and the Chamber of Secrets");
        B3 = new Buku("Harry Potter 3");
        B4 = new Buku("Harry Potter and the Goblet of Fire");
        B5 = new Buku("Harry Potter and the Order of the Phoenix");

        A1 = new Anggota("Arrietty");
        A2 = new Anggota("Belle");

        B3.setJudul("Harry Potter and the Prisoner of Azkaban");

        B5.setTersedia(false);
        System.out.println("Apakah buku " + B5.getJudul() + " tersedia? " + B5.isTersedia());

        try{
            A1.pinjamBuku(B1);
            A1.pinjamBuku(B2);
            A1.pinjamBuku(B3);
            // A1.pinjamBuku(B4);
            System.out.println(A1.getNama() + " meminjam buku " + A1.getBukuPinjaman()[0].getJudul() + ", " + A1.getBukuPinjaman()[1].getJudul() + ", dan " + A1.getBukuPinjaman()[2].getJudul());
            System.out.println("Jumlah buku yang dipinjam oleh " + A1.getNama() + " adalah " + + A1.getJumlahBukuPinjaman() + " buku");

            A2.pinjamBuku(B4);
            System.out.println("Jumlah buku yang dipinjam oleh " + A2.getNama() + " adalah " + + A2.getJumlahBukuPinjaman() + " buku");
            // A2.pinjamBuku(B3);
            // A2.pinjamBuku(B5);
            System.out.println(A2.getNama() + " meminjam buku " + A2.getBukuPinjaman()[0].getJudul());
        }
        catch(BukuTidakTersediaException be){
            System.out.println(be.getMessage());
        }
        catch(MaksimumBukuTerpinjamException me){
            System.out.println(me.getMessage());
        }
    }
}