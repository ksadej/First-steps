package Entity;
// Generated 2020-06-25 23:23:55 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Serviceman generated by hbm2java
 */
@Entity
@Table(name="serviceman"
    ,catalog="users"
)
public class Serviceman  implements java.io.Serializable {


     private Integer servicemanId;
     private String firstName;
     private String lastName;
     private String email;
     private String city;
     private String login;
     private String password;

    public Serviceman() {
    }

    public Serviceman(String firstName, String lastName, String email, String city, String login, String password) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.city = city;
       this.login = login;
       this.password = password;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ServicemanID", unique=true, nullable=false)
    public Integer getServicemanId() {
        return this.servicemanId;
    }
    
    public void setServicemanId(Integer servicemanId) {
        this.servicemanId = servicemanId;
    }

    
    @Column(name="FirstName", nullable=false)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="LastName", nullable=false)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="Email", nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="City", nullable=false)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="Login", nullable=false)
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    
    @Column(name="Password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


