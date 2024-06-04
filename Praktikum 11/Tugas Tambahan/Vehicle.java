// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Juni 2024
// Deskripsi: Kelas abstrak, berisi abstraksi kendaraan. Parent dari kelas Truck, RiverBarge, dan Airplane

public abstract class Vehicle{
    public double calcFuelEfficiency(){
        return 0.0;
    }

    public double calcTripDistance(){
        return 0.0;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
}