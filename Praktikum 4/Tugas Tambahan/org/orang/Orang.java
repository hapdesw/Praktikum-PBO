// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 17 Maret 2024
// Deskripsi: Representasi dasar dari objek orang

package org.orang;

public class Orang{
    // Atribut
    protected String nama;
    protected String nik;

    // Konstruktor
    public Orang(){
    }
    
    public Orang(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    // Method
    public String getNama(){
        return this.nama;
    }

    public String getNik(){
        return this.nik;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public void cetak(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
    }
}