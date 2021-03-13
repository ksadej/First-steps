/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hib_test_11;

import Entity.UserS;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Krzysiek
 */
public class Hib_test_11 {

    
    public UserS search(){
        String name = "root";
        SessionFactory sessionFactory = null;
        UserS e = (UserS) sessionFactory.getCurrentSession().createCriteria(UserS.class);
        Criteria crit = null;
        crit.add(Restrictions.eq("username", name)).uniqueResult(); 
        return e;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
//        
//        Hib_test_11 us = new Hib_test_11();
//        us.search();
        
        
        
        
        
        // zapisuje dane 
//        UserS us = new UserS();
//        us.setUsername("name");
//        us.setPassword("password");
//        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
//        s.beginTransaction();
//        s.save(us);
//        s.getTransaction().commit();


        //wyświetlanie pierwszego rekordu z tabeli 
//        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
//        s.beginTransaction();
//        UserS us = new UserS();
//        us = (UserS) s.get(UserS.class, 1);
//        System.out.println(us.getPassword());



        // wyświetlanie wiersza na podstawie unikatowej danej wiersza 
//        String name = "krzysiek";
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        
//        Criteria c = session.createCriteria(UserS.class);
//        c.add(Restrictions.eq("username", name));
//        
//        UserS us = (UserS) c.uniqueResult();
//        System.out.println( us.getPassword());
        


        // wyświetlanie tabeli 
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Criteria c = session.createCriteria(UserS.class);
//        List<UserS> us = c.list();
//        
//        for(UserS usr : us){
//            System.out.println(usr.getId() + "," +usr.getUsername()+","+usr.getPassword());
//        }





    }
}
