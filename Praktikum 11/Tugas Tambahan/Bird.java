// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Juni 2024
// Deskripsi: Kelas burung yang membuat implementasi metode abstrak dari hewan dan membuat implementasi metode dari interface IFlyer

public class Bird extends Animal implements IFlyer{
    public void takeOff(){
        System.out.println("Burung lepas landas");
    }

    public void land(){
        System.out.println("Burung mendarat");
    }

    public void fly(){
        System.out.println("Burung terbang");
    }

    public void buildNest(){
        System.out.println("Burung membuat sarang");
    }

    public void layEggs(){
        System.out.println("Burung bertelur");
    }

    public void eat(){
        System.out.println("Makanan Burung");
    }
}
