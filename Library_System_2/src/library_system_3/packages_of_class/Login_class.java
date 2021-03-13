/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system_3.packages_of_class;

import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import library_system_3.Home;
import library_system_3.Loading;

/**
 *
 * @author Krzysiek
 */
public class Login_class {
    
    public void login(JTextField a, JTextField b){
        
         Connection con = db_connection.getConnectiom();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement("SELECT * FROM account WHERE username=? and password=?");
            ps.setString(1, a.getText());
            ps.setString(2, b.getText());
            rs=ps.executeQuery();
            
            if(rs.next()){
                rs.close();
                ps.close();
              Home log = new Home();
              log.setVisible(true);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
