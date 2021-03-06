package Entity;
// Generated 2019-08-31 23:36:55 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Pracownik generated by hbm2java
 */
@Entity
@Table(name="pracownik"
    ,catalog="p_i"
)
public class Pracownik  implements java.io.Serializable {


     private Integer id;
     private String imie;
     private String nazwisko;
     private String email;
     private int czyAdmin;

    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, String email, int czyAdmin) {
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.email = email;
       this.czyAdmin = czyAdmin;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="imie", nullable=false, length=22)
    public String getImie() {
        return this.imie;
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }

    
    @Column(name="nazwisko", nullable=false, length=22)
    public String getNazwisko() {
        return this.nazwisko;
    }
    
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    
    @Column(name="email", nullable=false, length=22)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="czy_admin", nullable=false)
    public int getCzyAdmin() {
        return this.czyAdmin;
    }
    
    public void setCzyAdmin(int czyAdmin) {
        this.czyAdmin = czyAdmin;
    }




}


