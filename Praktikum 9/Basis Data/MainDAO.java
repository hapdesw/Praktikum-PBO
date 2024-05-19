// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 19 Mei 2024
// Deskripsi: Main program untuk akses DAO

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Anu");
        Person person2 = new Person("Budi");
        Person person3 = new Person("Cica");
        DAOManager m = new DAOManager();

        m.setPersonDAO(new MySQLPersonDAO());

        try{
            m.getPersonDAO().savePerson(person);
            m.getPersonDAO().savePerson(person2);
            m.getPersonDAO().savePerson(person3);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
