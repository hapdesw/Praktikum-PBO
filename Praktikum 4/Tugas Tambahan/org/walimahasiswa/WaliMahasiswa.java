// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 17 Maret 2024
// Deskripsi: Representasi dasar dari objek walimahasiswa, turunan kelas orang

package org.walimahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang{
    // Atribut
    private String nomorHp;
    private String alamat;

    // Konstruktor
    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat){
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    // Method
    public String getNomorHp(){
        return this.nomorHp;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void cetak(){
        super.cetak();
        System.out.println("Nomor HP: " + getNomorHp());
        System.out.println("Alamat: " + getAlamat());
    }
}
