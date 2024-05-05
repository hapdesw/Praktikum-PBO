// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Mei 2024
// Deskripsi: Representasi dasar dari objek kontrol senjata

package latihanMedium;

/**
 *
 * @author hapdesw
 */
public class KontrolSenjata {
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public int isiPeluru(int jumPeluru){
        int p = senjata.getPeluru() + jumPeluru;
        senjata.setPeluru(p);
        System.out.println("Peluru berhasil ditambah: " + p);
        return p;
    }
    
    public int menembak(int jumlah){
        System.out.println("Siap menembak " + jumlah + " kali");
        int jumlahPeluru = senjata.getPeluru();
        if (isAdaPeluru()){
            if (jumlah > jumlahPeluru){
                int selisih = jumlah - jumlahPeluru;
                for (int i = 0; i < jumlahPeluru; i++){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
                for (int i = 0; i < selisih; i++){
                    System.out.println("Gagal menembak, peluru habis");
                }
            }
            else{
                for (int i = 0; i < jumlah; i++){
                    System.out.println(senjata.getBunyi());
                    jumlahPeluru = jumlahPeluru - 1;
                    senjata.setPeluru(jumlahPeluru);
                }
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }
        else{
            System.out.println("Peluru habis");
        }
        return senjata.getPeluru();
    }
    
    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb!";
        }
        else{
            return "Gagal. Bayonet belum terpasang.";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang.");
    }
}
