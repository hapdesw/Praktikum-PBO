// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 28 Februari 2024
// Deskripsi: Kelas yang berisi program utama untuk  mengaplikasikan class Garis

public class MGaris {
    public static void main(String[] args){
        // Garis G1
        Garis g1 = new Garis(new Titik(2, 3), new Titik(4,7));
        System.out.println("\nGaris G1: (" + g1.getTitikAwal().getAbsis() + ", " + g1.getTitikAwal().getOrdinat() + ")" + ", "  + "(" + g1.getTitikAkhir().getAbsis() + ", " + g1.getTitikAkhir().getOrdinat() + ")");
        
        float panjangGaris = g1.getPanjang();
        System.out.printf("Panjang garis G1: %.3f", panjangGaris);
        
        float gradien = g1.getGradien();
        System.out.printf("\nGradien garis G1: %.3f", gradien);

        // Garis G2
        Garis g2 = new Garis(new Titik(3, 1), new Titik(7,5));
        System.out.println("\n\nGaris G2: (" + g2.getTitikAwal().getAbsis() + ", " + g2.getTitikAwal().getOrdinat() + ")" + ", "  + "(" + g2.getTitikAkhir().getAbsis() + ", " + g2.getTitikAkhir().getOrdinat() + ")");

        boolean tegakLurus1 = g1.isTegakLurus(g2);
        System.out.println("Apakah garis G1 tegak lurus dengan garis G2? " + tegakLurus1);

        // Garis G3
        Garis g3 = g2.getRefleksiY();
        System.out.printf("\nGaris G3 pencerminan Y: (" + g3.getTitikAwal().getAbsis() + ", " + g3.getTitikAwal().getOrdinat() + ")" + ", " + "(" + g3.getTitikAkhir().getAbsis()  + ", " + g3.getTitikAkhir().getOrdinat() + ")");

        // Garis G4
        Garis g4 = new Garis(new Titik(1, 2), new Titik(3,5));
        System.out.println("\n\nGaris G4: (" + g4.getTitikAwal().getAbsis() + ", " + g4.getTitikAwal().getOrdinat() + ")" + ", "  + "(" + g4.getTitikAkhir().getAbsis() + ", " + g4.getTitikAkhir().getOrdinat() + ")");

        // Garis G5
        Garis g5 = new Garis(new Titik(2, 4), new Titik(5,2));
        System.out.println("Garis G5: (" + g5.getTitikAwal().getAbsis() + ", " + g5.getTitikAwal().getOrdinat() + ")" + ", "  + "(" + g5.getTitikAkhir().getAbsis() + ", " + g5.getTitikAkhir().getOrdinat() + ")");

        boolean tegakLurus2 = g4.isTegakLurus(g5);
        System.out.println("Apakah garis G4 tegak lurus dengan garis G5? " + tegakLurus2);
    }
}
