/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Entity.Pracownik;
import Util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Krzysiek
 */
public class CRUD {
    
    public void zapisz(String name, String nazwisko, String email, int czy_adm){
        Pracownik pr = new Pracownik();
        pr.setImie(name);
        pr.setNazwisko(nazwisko);
        pr.setEmail(email);
        pr.setCzyAdmin(czy_adm);
        Session a = HibernateUtil.getSessionFactory().getCurrentSession();
        a.beginTransaction();
        a.save(pr);
        a.getTransaction().commit();
    }
    
    public void usun(){
        
    }
}
