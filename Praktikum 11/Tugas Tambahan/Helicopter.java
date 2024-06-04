// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Juni 2024
// Deskripsi: Kelas helikopter yang membuat implementasi metode abstrak dari kendaraan dan membuat implementasi metode dari interface IFlyer

public class Helicopter extends Airplane{
    private double maxLoad;

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public void takeOff(){
        System.out.println("Helikopter lepas landas");
    }

    public void land(){
        System.out.println("Helikopter mendarat");
    }

    public void fly(){
        System.out.println("Helikopter terbang");
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.0012;
    }

    public double calcTripDistance(){
        double fuelCapacity = 100;
        return calcFuelEfficiency() * fuelCapacity;
    }
}
