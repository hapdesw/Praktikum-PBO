// Nama: Happy Desita W.        
// NIM: 24060122120023
// Tanggal: 19 Mei 2024
// Deskripsi: Implementasi PersonDAO untuk MySQL

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3307/pbo", "root", "1234");
        
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);

        Statement s = con.createStatement();
        s.executeUpdate(query);

        con.close();
    }
}
