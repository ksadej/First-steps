/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Krzysiek
 */
public class DB_Connection {
    public static Connection getConnection()
    {
    
    Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;          
    }
}
