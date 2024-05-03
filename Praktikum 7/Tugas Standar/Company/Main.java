// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 1 Mei 2024
// Deskripsi: Driver class untuk Pegawai, Manajer, Programmer, dan Payroll

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Hermione");
        Pegawai pegawai2 = new Manajer("Nanno");
        Pegawai pegawai3 = new Manajer("Mila");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
