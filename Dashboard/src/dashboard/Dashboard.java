/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Krzysiek
 */
public class Dashboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
   
    
    Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("F:\\TabelaTestowa","","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }     
        
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM TabelaTestowa");
        
        while(rs.next()){  
            System.out.println(rs.getString(1));  
        }  
    }
   
}
