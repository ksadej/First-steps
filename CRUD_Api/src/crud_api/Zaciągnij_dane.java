/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud_api;

import com.mycompany.db_connection.Connection_to_db;
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
public class Zaciągnij_dane {
    
    public void dane_Tabela(JTable table,String zmienna){
        Connection con = Connection_to_db.getConnection();
        PreparedStatement ps;
        
         try {
            ps = con.prepareStatement("SELECT * FROM `uczen` WHERE CONCAT('Imie', 'Nazwisko', 'EMAIL')LIKE ?");
            ps.setString(1, "%"+zmienna+"%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
                       
            Object[] row;
            
            while(rs.next()){
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);

                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Zaciągnij_dane.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
           
}
