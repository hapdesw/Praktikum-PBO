// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 19 Mei 2024
// Deskripsi: Program untuk serialisasi objek Person

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        Person person2 = null;

        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);

            person = (Person) s.readObject();
            person2 = (Person) s.readObject();

            s.close();
            System.out.println("Serialized person name: " + person.getName()); 
            System.out.println("Serialized person name: " + person2.getName()); 
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
