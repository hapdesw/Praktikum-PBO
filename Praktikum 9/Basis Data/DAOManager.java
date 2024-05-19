// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 19 Mei 2024
// Deskripsi: Pengelola DAO dalam program

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
