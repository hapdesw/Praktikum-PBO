// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 2 Maret 2024
// Deskripsi: Kelas yang berisi program utama untuk mengaplikasikan class WaliMahasiswa dan Mahasiswa

public class Main {
    public static void main(String[] args){
        Mahasiswa M1;
        Mahasiswa M2;
        Mahasiswa M3;

        WaliMahasiswa WM1;
        WaliMahasiswa WM2;
        WaliMahasiswa WM3;

        WM1 = new WaliMahasiswa("James Potter", "08123", "Desa Godric's Hollow");
        M1 = new Mahasiswa("Harry Potter", "12345", "Kriminologi", WM1);
        M1.cetak();

        WM2 = new WaliMahasiswa("Mr Granger", "08456", "Hampstead Garden");
        M2 = new Mahasiswa("Hermione Granger", "67890", "Kedokteran", WM2);
        System.out.println();
        M2.cetak();

        WM3 = new WaliMahasiswa("Frank Longbottom", "-", "Rumah Longbottom");
        M3 = new Mahasiswa("Neville Longbottom", "24680", "Agroekoteknologi", WM3);
        System.out.println();
        System.out.println("Jurusan dari mahasiswa bernama " + M3.getNama() + " dengan NIM " + M3.getNim() + " adalah " + M3.getJurusan());
        System.out.println("Wali mahasiswa dari " + M3.getNama() + " adalah " + M3.getWali().getNama() + " dengan nomor HP " + M3.getWali().getNomorHp() + " dan beralamatkan di " + M3.getWali().getAlamat());
        WM3.setNomorHp("08789");
        System.out.println("Wali mahasiswa dari " + M3.getNama() + " adalah " + M3.getWali().getNama() + " dengan nomor HP " + M3.getWali().getNomorHp() + " dan beralamatkan di " + M3.getWali().getAlamat());
    }
}
