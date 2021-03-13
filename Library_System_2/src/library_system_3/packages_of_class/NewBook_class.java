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
import javax.swing.JTextField;

/**
 *
 * @author Krzysiek
 */
public class NewBook_class {
    
    public void add(String book_id, String name, String edition, String publisher, String price, String page){
        Connection con = db_connection.getConnectiom();
        PreparedStatement ps;
        
        try {
            ps = con.prepareCall("INSERT INTO book (book_id, name, edition, publisher, price, page) VALUE (?,?,?,?,?,?)");
            ps.setString(1, book_id);
            ps.setString(2, name);
            ps.setString(3, edition);
            ps.setString(4, publisher);
            ps.setString(5, price);
            ps.setString(6, page);
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "add");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewBook_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
