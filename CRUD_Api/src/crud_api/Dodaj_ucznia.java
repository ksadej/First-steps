/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud_api;

import com.mycompany.db_connection.Connection_to_db;
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
public class Dodaj_ucznia {
    
    public void Dodaj(Integer id, String name, String lname, String email){
        Connection con = Connection_to_db.getConnection();
        PreparedStatement ps;
        
         try {
                ps = con.prepareStatement("INSERT INTO uczen(Imie, Nazwisko, EMAIL) VALUES (?,?,?)");
                ps.setString(1, name);
                ps.setString(2, lname);
                ps.setString(3, email);


                
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Nowe zgloszenie dodane");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dodaj_ucznia.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
