// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 28 Februari 2024
// Deskripsi: Kelas yang berisi program utama untuk  mengaplikasikan class Titik

public class MTitik{
  public static void main(String[] args){
    Titik t1;
    Titik t2;
    Titik t3;
    Titik t4;
    Titik t5;

    t1 = new Titik();
    t2 = new Titik();
    t3 = new Titik(5, 6);
    
    t1.setAbsis(10);
    t1.setOrdinat(8);
    t2.setAbsis(4);
    t2.setOrdinat(6);

    float absis;
    float ordinat;

    // Titik T1
    absis = t1.getAbsis();
    ordinat = t1.getOrdinat();
    System.out.printf("\nT1 = (%.1f, %.1f)\n", absis, ordinat);

    t1.refleksiY();
    System.out.println("Titik T1 setelah pencerminan terhadap sumbu Y: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

    // Titik T2
    absis = t2.getAbsis();
    ordinat = t2.getOrdinat();
    System.out.printf("\nT2 = (%.1f, %.1f)\n", absis, ordinat);

    float jarakPusat = t2.getJarakPusat();
    System.out.printf("Jarak T2 dengan titik pusat: %.3f\n", jarakPusat);

    // Titik T3
    System.out.printf("\nT3 = (%.1f, %.1f)", t3.getAbsis(), t3.getOrdinat());

    t3.refleksiX();
    System.out.println("\nTitik T3 setelah pencerminan terhadap sumbu X: (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
    
    // Titik T4
    t4 = t2.getRefleksiX();
    System.out.printf("\nTitik T2 pencerminan X: (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");

    // Titik T5
    t5 = t2.getRefleksiY();
    System.out.printf("\nTitik T2 pencerminan Y: (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");

    // 3.1 Enkapsulasi
    // KESIMPULAN 
    // Jika access modifier atribut adalah private, maka atribut tidak bisa dipanggil secara langsung.
        // Jika ingin mengakses atribut, maka harus menggunakan method seperti getAbsis() dan getOrdinat().
        // Tetapi jika acces modifier atribut adalah public, maka atribut bisa dipanggil secara langsung.
    // Jika access modifier konstruktor adalah private, maka program main akan error karena konstruktor
        // tidak bisa diaplikasikan ke dalam program main. Tetapi jika access modifier konstruktor adalah
        // public, maka program main akan berjalan sebagaimana mestinya.
    // Jika access modifier method adalah private, maka program main akan error karena method tersebut 
        // tidak bisa diakses di program main. Tetapi jika acces modifier method adalah public, maka method 
        // tersebut bisa dipanggil atau diakses di program main sehingga program main bisa berjalan sebagaimana mestinya.

    }
}