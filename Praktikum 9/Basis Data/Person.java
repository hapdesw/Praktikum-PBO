// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 19 Mei 2024
// Deskripsi: Person database model

public class Person {
    private int id;
    private String name;


    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
