package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="priority"
    ,catalog="users"
)
public class Priority  implements java.io.Serializable {

     private Integer priorityId;
     private String priority;

    public Priority() {
    }

    public Priority(String priority) {
       this.priority = priority;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="PriorityID", unique=true, nullable=false)
    public Integer getPriorityId() {
        return this.priorityId;
    }
    
    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    
    @Column(name="Priority", nullable=false)
    public String getPriority() {
        return this.priority;
    }
    
    public void setPriority(String priority) {
        this.priority = priority;
    }
}


