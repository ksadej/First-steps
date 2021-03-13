/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hib_test_7;

import Entity.Pracownik;
import Util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Krzysiek
 */
public class NewClass {
     public static void main(String[] args) {
        // TODO code application logic here
        
        
        Pracownik pr = new Pracownik();
        //us.setId(2);
        pr.setImie("fdfd");
        pr.setNazwisko("xsdsxx");
        pr.setEmail("ddd");
        pr.setCzyAdmin(2);
        Session a = HibernateUtil.getSessionFactory().getCurrentSession();
        a.beginTransaction();
        a.save(pr);
        a.getTransaction().commit();
    }
}
