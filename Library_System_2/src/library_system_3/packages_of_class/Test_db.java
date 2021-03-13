/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system_3.packages_of_class;

import library_system_2.*;
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
    public static void main(String[] args) throws ClassNotFoundException  {
    
    
       Connection con = null;
           
        try {          
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","Metus","");
           if (con != null){
               System.out.println("Connectet to db");
           }
        } catch (SQLException ex) {
            System.out.println("error - not connected");
            ex.printStackTrace();
            
        }
                 
    }   
}

