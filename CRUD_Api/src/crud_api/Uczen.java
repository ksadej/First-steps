/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud_api;

/**
 *
 * @author Krzysiek
 */
public class Uczen {
    private int id;
    private String Imie;
    private String Nazwisko;
    private int PESEl;
    public Uczen(int pid, String pImie, String pNazwisko, int pPESEL )
    {
        this.id = pid;
        this.Imie = pImie;
        this.Nazwisko = pNazwisko;
        this.PESEl = pPESEL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String Imie) {
        this.Imie = Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    public int getPESEl() {
        return PESEl;
    }

    public void setPESEl(int PESEl) {
        this.PESEl = PESEl;
    }
    
    
    
}
