/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system_2;

import java.sql.*;

/**
 *
 * @author Krzysiek
 */
public class Java_con {
    
     public static Connection getConnection()
    {
    
    Connection con = null;
        
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://DESKTOP-K0R9Q5L;databaseName=test_2";
    String user="KSA";
    String pass="Dzban123!";
    
        try {          
           Class.forName(driver);
           con = DriverManager.getConnection(url,user,pass);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;          
    }
}
