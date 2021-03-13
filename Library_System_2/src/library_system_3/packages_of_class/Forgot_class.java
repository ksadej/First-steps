/////*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package library_system_3.packages_of_class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Krzysiek
 */
public class Forgot_class {
    
    public void search(String name, JTextField t, JTextField d){
        
        Connection con = db_connection.getConnectiom();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement("SELECT * FROM Account WHERE username = '"+name+"'");
            rs = ps.executeQuery();
            
            if(rs.next()){
               t.setText(rs.getString(1));
               d.setText(rs.getString(4));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Forgot_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void retrive(JTextField answer, JTextField d){
        
        Connection con = db_connection.getConnectiom();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement("SELECT * FROM Account WHERE username = '"+answer+"'");
            rs = ps.executeQuery();

            try{
                if(rs.next()){
                d.setText(rs.getString(5));
            }
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "błąd");
            }
                       
        } catch (SQLException ex) {
            Logger.getLogger(Forgot_class.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
