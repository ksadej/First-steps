package Entity;
// Generated 2019-08-31 23:36:55 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Zgloszenie generated by hbm2java
 */
@Entity
@Table(name="zgloszenie"
    ,catalog="p_i"
)
public class Zgloszenie  implements java.io.Serializable {


     private Integer idZ;
     private String temat;
     private String opis;
     private String kategoria;
     private String podkategoria;

    public Zgloszenie() {
    }

    public Zgloszenie(String temat, String opis, String kategoria, String podkategoria) {
       this.temat = temat;
       this.opis = opis;
       this.kategoria = kategoria;
       this.podkategoria = podkategoria;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_z", unique=true, nullable=false)
    public Integer getIdZ() {
        return this.idZ;
    }
    
    public void setIdZ(Integer idZ) {
        this.idZ = idZ;
    }

    
    @Column(name="temat", nullable=false, length=22)
    public String getTemat() {
        return this.temat;
    }
    
    public void setTemat(String temat) {
        this.temat = temat;
    }

    
    @Column(name="opis", nullable=false, length=22)
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }

    
    @Column(name="kategoria", nullable=false, length=22)
    public String getKategoria() {
        return this.kategoria;
    }
    
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    
    @Column(name="podkategoria", nullable=false, length=22)
    public String getPodkategoria() {
        return this.podkategoria;
    }
    
    public void setPodkategoria(String podkategoria) {
        this.podkategoria = podkategoria;
    }




}


