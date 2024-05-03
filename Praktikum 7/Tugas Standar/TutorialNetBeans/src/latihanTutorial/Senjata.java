// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 1 Mei 2024
// Deskripsi: Representasi dasar dari objek senjata

package latihanTutorial;

/**
 *
 * @author hapdesw
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    private String getBunyi(){
        return bunyi;
    }
    
    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    private boolean isMenusuk(){
        return menusuk;
    }
    
    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++){
            System.out.print(getBunyi() + " ");
        }
        System.out.println("");
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet terpasang.");
    }
    
    public String menusuk(){
        if (isMenusuk()){
            return "Jleb!";
        }
        else{
            return "Gagal. Bayonet belum terpasang.";
        }
    }
}
