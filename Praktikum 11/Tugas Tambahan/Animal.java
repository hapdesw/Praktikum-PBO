// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Juni 2024
// Deskripsi: Kelas abstrak, berisi abstraksi hewan. Parent dari kelas Kryptonian dan Bird

public abstract class Animal {
    public abstract void eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
