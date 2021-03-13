/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krzysiek
 */
public class Function {
     public void dane_Tabela(JTable table,String zmienna){
         
        Connection con = DB_Connection.getConnection();
        PreparedStatement ps;
        
         try {
            ps = con.prepareStatement("SELECT * FROM `user_2` WHERE id = ?");
            ps.setString(1, zmienna);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
                       
            Object[] row;
            
            while(rs.next()){
                row = new Object[2];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);

                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
