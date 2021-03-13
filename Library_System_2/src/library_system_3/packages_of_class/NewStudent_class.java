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
public class NewStudent_class {
    
    public void add_student(String student_id, String name, String father, String course, String branch, String year, String semestr){
        
        Connection con = db_connection.getConnectiom();
        PreparedStatement ps;
        
        try {
            ps = con.prepareCall("INSERT INTO student (student_id, name, father, course, branch, year, semestr) VALUE (?,?,?,?,?,?,?)");
            ps.setString(1, student_id);
            ps.setString(2, name);
            ps.setString(3, father);
            ps.setString(4, course);
            ps.setString(5, branch);
            ps.setString(6, year);
            ps.setString(7, semestr);
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "add");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewStudent_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
