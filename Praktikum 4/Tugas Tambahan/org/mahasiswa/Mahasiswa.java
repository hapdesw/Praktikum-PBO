// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 17 Maret 2024
// Deskripsi: Representasi dasar dari objek mahasiswa, turunan kelas orang

package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang{
    // Atribut
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    // Konstruktor
    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    // Method
    public String getNim(){
        return this.nim;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public WaliMahasiswa getWali(){
        return this.wali;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        super.cetak();
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("------ Wali Mahasiswa ------");
        wali.cetak();
    }
}
