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
public class Singup_class {
    
    public void zapisz(String name, String username, String password, String question, String answer){
        
        Connection con = db_connection.getConnectiom();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO account (name, username, password, sec_q, answer) value (?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, question);
            ps.setString(5, answer);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "add");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Singup_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
