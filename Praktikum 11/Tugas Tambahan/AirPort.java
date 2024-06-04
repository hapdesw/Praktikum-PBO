// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 4 Juni 2024
// Deskripsi: Kelas bandara yang dapat memberikan izin ke pesawat untuk mendarat

public class AirPort{
    private Airplane airplane;
    private String name;

    public AirPort(String name){
        this.name = name;
    }

    public String givePermission(IFlyer flyer){
        if (flyer instanceof Airplane) {
            return airplane.toString() + "diberikan izin untuk mendarat.";
        } else {
            return airplane.toString() + "tidak diberikan izin untuk mendarat.";
        }
    }
}
