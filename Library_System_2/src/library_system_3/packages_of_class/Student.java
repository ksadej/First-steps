/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system_3.packages_of_class;

/**
 *
 * @author Krzysiek
 */
public class Student {
    
    private int student_id;
    private String name, father, course, branch, year, semestr;

    public Student(int student_id, String name, String father, String course, String branch, String year, String semestr) {
        this.student_id = student_id;
        this.name = name;
        this.father = father;
        this.course = course;
        this.branch = branch;
        this.year = year;
        this.semestr = semestr;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Student(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getName() {
        return name;
    }

    public String getFather() {
        return father;
    }

    public String getCourse() {
        return course;
    }

    public String getBranch() {
        return branch;
    }

    public String getYear() {
        return year;
    }

    public String getSemestr() {
        return semestr;
    }
    
}
