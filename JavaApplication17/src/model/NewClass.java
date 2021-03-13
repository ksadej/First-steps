/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.User2;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Krzysiek
 */
public class NewClass {
    public static void main(String[] args) {
        // TODO code application logic here
        
        User2 us = new User2();
        //us.setId(2);
//        us.setName("12");
//        
//        Session a = HibernateUtil.getSessionFactory().getCurrentSession();
//        a.beginTransaction();
//        a.save(us);
//        a.getTransaction().commit();


// wyświetlanie danych 
        Session a = HibernateUtil.getSessionFactory().getCurrentSession();
        a.beginTransaction();
        us = (User2) a.get(User2.class, 1);
        System.out.println("Name: "+us.getName());

//try{
//        Session a = HibernateUtil.getSessionFactory().getCurrentSession();
//        Transaction tx;
//        List<User2> listUser = null;
//        tx = a.beginTransaction();
//        listUser = (List<User2>) a.createQuery("SELECT (b) FROM user_2 b");
//        tx.commit();
//        a.close();
//}
//    catch(Exception e){
//        System.out.println(e.getMessage());
//    }



//        try{
//            Configuration cfg = new Configuration();
//            cfg.configure("hibernate.cfg.xml");
//            SessionFactory factory = cfg.buildSessionFactory();
//            Session session = factory.openSession();
//            Transaction t = session.beginTransaction();
//            Query query = session.createQuery("from User2");
//            java.util.List list = query.list();
//            System.out.println(list);
//            t.commit();
//            session.close();
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }



// wyświetlanie danych 
//        try{
//            Configuration cfg = new Configuration();
//            cfg.configure("hibernate.cfg.xml");
//            SessionFactory factory = cfg.buildSessionFactory();
//            Session session = factory.openSession();
//            Transaction t = session.beginTransaction();
//            
//            String sql_query = "from User2";
//            Query query = session.createQuery(sql_query);
//            Iterator it=query.iterate();
//            User2 usr = new User2();
//            while(it.hasNext())
//                {
//                     usr = (User2) it.next();
//                    System.out.println("Id : "+usr.getId()+" Name :"+usr.getName());
//                }
//            t.commit();
//            session.close();
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }

    }
}
