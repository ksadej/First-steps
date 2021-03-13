/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system_3.packages_of_class;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Krzysiek
 */


//rejestracja silnika obsługi bazy danych (biblioteka klas)
//tworzymy obiekt połączenia
//tworzymy obiekt Statement odpowiedzialny za tworzenie zapytań do bazy sql
//wykonujemy zapytanie
//zamykamy obiekt połączenia


public class db_connection {
    
    public static Connection getConnectiom(){
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","Metus","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
