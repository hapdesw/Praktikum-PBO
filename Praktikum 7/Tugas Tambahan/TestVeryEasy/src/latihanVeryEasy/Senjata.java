// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 5 Mei 2024
// Deskripsi: Representasi dasar dari objek senjata

package latihanVeryEasy;

/**
 *
 * @author hapdesw
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
    public void menembak(){
        int jumlahPeluru = getPeluru();
        if (peluru > 0){
            System.out.println(getBunyi());
            jumlahPeluru = jumlahPeluru - 1;
            setPeluru(jumlahPeluru);
        }
        else{
            System.out.println("Peluru habis");
        }
        System.out.println("Sisa peluru: " + jumlahPeluru);
    }
}
