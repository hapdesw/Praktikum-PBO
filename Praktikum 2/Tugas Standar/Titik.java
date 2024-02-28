// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 28 Februari 2024
// Deskripsi: Kelas yang berisi program class Titik

public class Titik{
    // atribut
    private float absis;
    private float ordinat;


    // konstruktor
    public Titik(float absis, float ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public Titik(){
        this(0,0);
    }

    
    // method
    public void setAbsis(float absis){
        this.absis = absis;
    }

    public void setOrdinat(float ordinat){
        this.ordinat = ordinat;
    }

    public float getAbsis(){
        return this.absis;
    }

    public float getOrdinat(){
        return this.ordinat;
    }

    public float getJarakPusat(){
        return (float) Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public void refleksiX(){
        this.ordinat = this.ordinat*(-1);
    }

    public void refleksiY(){
        this.absis = this.absis*(-1);
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, this.ordinat*(-1));
    }

    public Titik getRefleksiY(){
        return new Titik(this.absis*(-1), this.ordinat);
    }
}
