package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category"
    ,catalog="users"
)
public class Category  implements java.io.Serializable {

     private int categoryId;
     private String category;

    public Category() {
    }

    public Category(int categoryId, String category) {
       this.categoryId = categoryId;
       this.category = category;
    }
   
     @Id 
    @Column(name="CategoryID", unique=true, nullable=false)
    public int getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    
    @Column(name="Category", nullable=false)
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
}


