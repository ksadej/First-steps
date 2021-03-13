/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system_3.packages_of_class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Krzysiek
 */
public class Test_zapisz {
    
    public void zapisz(String name){
        Connection con = db_connection.getConnectiom();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO user_2 (name) value (?)");
            ps.setString(1, name);
           
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "add");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Test_zapisz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
