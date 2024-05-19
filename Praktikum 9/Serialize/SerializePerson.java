// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 19 Mei 2024
// Deskripsi: Program untuk serialisasi objek Person

import java.io.*;

class Person implements Serializable{
    private String name;

    public Person(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}


public class SerializePerson{
    public static void main(String[] args) {
        Person person = new Person("Dodi");
        Person person2 = new Person("Eli");

        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);

            s.writeObject(person);
            s.writeObject(person2);
            System.out.println("Selesai menulis objek person");
            s.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}