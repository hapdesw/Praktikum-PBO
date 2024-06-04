// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Juni 2024
// Deskripsi: Kelas truk yang membuat implementasi metode abstrak dari kendaraan

public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.0023;
    }

    public double calcTripDistance(){
        double fuelCapacity = 300;
        return calcFuelEfficiency() * fuelCapacity;
    }
}
