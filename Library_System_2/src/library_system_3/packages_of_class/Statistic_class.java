/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system_3.packages_of_class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krzysiek
 */
public class Statistic_class {
    
    public ArrayList<Student> getStudents(){
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        Connection con = db_connection.getConnectiom();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM student WHERE CONCAT('student_id','name','father','course','branch','year','semestr')LIKE ?");
            ResultSet rs = ps.executeQuery();
            
            Student student;
            while(rs.next()){
                student = new Student(rs.getInt("student_id"), rs.getString("name"), rs.getString("father"),rs.getString("course"),rs.getString("branch"),rs.getString("year"),rs.getString("semestr") );
                studentList.add(student);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Statistic_class.class.getName()).log(Level.SEVERE, null, ex);
        }
            return studentList;
    }
    
    public void display_students(JTable table){
         ArrayList<Student> list = getStudents();
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         
         Object[] row = new Object[7];
         for(int i=0; i<list.size(); i++){
             row[0] = list.get(i).getStudent_id();
             row[1] = list.get(i).getName();
             row[2] = list.get(i).getFather();
             row[3] = list.get(i).getCourse();
             row[4] = list.get(i).getBranch();
             row[5] = list.get(i).getYear();
             row[6] = list.get(i).getSemestr();
             
             model.addRow(row);
         }
        
    }
    
}
