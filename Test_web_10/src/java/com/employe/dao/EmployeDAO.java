/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employe.dao;

import com.employe.pojo.Employee;
import com.employe.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Krzysiek
 */
public class EmployeDAO {
    
    public void saveEmploye(Employee emp){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(emp);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public void deleteEmploye(Employee emp){
        
    }
    
    public void updateEmploye(Employee emp){
        
    }
    
    @SuppressWarnings("unchecked")
    public List <Employee> getListOfEmploye(){
        
        Transaction transaction = null;
        List<Employee> listOfEmploye = null;
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query = (Query) session.createQuery("from Employee");
            listOfEmploye = query.list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfEmploye;   
        
    }
}
