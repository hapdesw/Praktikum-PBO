// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Juni 2024
// Deskripsi: Kelas kapal tongkang yang membuat implementasi metode abstrak dari kendaraan

public class RiverBarge extends Vehicle{
    private double maxLoad;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.0056;
    }

    public double calcTripDistance(){
        double fuelCapacity = 700;
        return calcFuelEfficiency() * fuelCapacity;
    }
}
