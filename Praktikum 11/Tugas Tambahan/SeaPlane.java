// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Juni 2024
// Deskripsi: Kelas pesawat amfibi yang membuat implementasi metode abstrak dari kendaraan dan membuat implementasi metode dari interface IFlyer

public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public void takeOff(){
        System.out.println("Pesawat amfibi lepas landas");
    }

    public void land(){
        System.out.println("Pesawat amfibi mendarat");
    }

    public void fly(){
        System.out.println("Pesawat amfibi terbang");
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.0045;
    }

    public double calcTripDistance(){
        double fuelCapacity = 500;
        return calcFuelEfficiency() * fuelCapacity;
    }
}
