/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system_2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krzysiek
 */
public class Test_db {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    
    
        Connection con = null;
        
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://DESKTOP-K0R9Q5L;databaseName=test_2";
    String user="KSA";
    String pass="Dzban123!";
    
        try {          
           Class.forName(driver);
           con = DriverManager.getConnection(url,user,pass);
           if (con != null){
               System.out.println("Connectet to db");
           }
        } catch (SQLException ex) {
            System.out.println("error - not connected");
            ex.printStackTrace();
            
        }
                 
    }   
}

