package Entity;
// Generated 2019-08-31 23:36:55 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ZgloszenieZamkniete generated by hbm2java
 */
@Entity
@Table(name="zgloszenie_zamkniete"
    ,catalog="p_i"
)
public class ZgloszenieZamkniete  implements java.io.Serializable {


     private Integer idZZ;
     private int idZ;
     private String temat;
     private String opis;
     private String kategoria;
     private String podkategoria;

    public ZgloszenieZamkniete() {
    }

    public ZgloszenieZamkniete(int idZ, String temat, String opis, String kategoria, String podkategoria) {
       this.idZ = idZ;
       this.temat = temat;
       this.opis = opis;
       this.kategoria = kategoria;
       this.podkategoria = podkategoria;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_z_z", unique=true, nullable=false)
    public Integer getIdZZ() {
        return this.idZZ;
    }
    
    public void setIdZZ(Integer idZZ) {
        this.idZZ = idZZ;
    }

    
    @Column(name="id_z", nullable=false)
    public int getIdZ() {
        return this.idZ;
    }
    
    public void setIdZ(int idZ) {
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


