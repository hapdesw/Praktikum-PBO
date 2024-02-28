// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 28 Februari 2024
// Deskripsi: Kelas yang berisi program class Garis

public class Garis {
    // atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    

    // konstruktor
    public Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    
    // method
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }
    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }
    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public float getPanjang(){
        float a = (titikAkhir.getAbsis()-titikAwal.getAbsis())*(titikAkhir.getAbsis()-titikAwal.getAbsis());
        float b = (titikAkhir.getOrdinat()-titikAwal.getOrdinat())*(titikAkhir.getOrdinat()-titikAwal.getOrdinat());
        return (float) Math.sqrt(a + b);
    }

    public float getGradien(){
        float m = (titikAkhir.getOrdinat()-titikAwal.getOrdinat()) / (titikAkhir.getAbsis()-titikAwal.getAbsis());
        return m;
    }

    public Garis getRefleksiY(){
        return new Garis(new Titik(titikAwal.getAbsis()*(-1), titikAwal.getOrdinat()), new Titik(titikAkhir.getAbsis()*(-1), titikAkhir.getOrdinat()));
    }
    
    public boolean isTegakLurus(Garis G){
        float m1 = this.getGradien();
        float m2 = G.getGradien();
        if (m1 * m2 == -1){
            return true;
        }
        else{
            return false;
        }
    }
}
