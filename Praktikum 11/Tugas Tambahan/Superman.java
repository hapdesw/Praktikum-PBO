// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Juni 2024
// Deskripsi: Kelas superman yang membuat implementasi metode abstrak dari hewan dan membuat implementasi metode dari interface IFlyer

public class Superman extends Kryptonian{
    private String name;

    public Superman(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void takeOff(){
        System.out.println("Superman lepas landas");
    }

    public void land(){
        System.out.println("Superman mendarat");
    }

    public void fly(){
        System.out.println("Superman terbang");
    }

    public void leapBuilding(){
        System.out.println("Superman melompati bangunan");
    }

    public void stopBullet(){
        System.out.println("Superman menghentikan peluru");
    }

    public void eat(){
        System.out.println("Nasi Goreng");
    }
}
