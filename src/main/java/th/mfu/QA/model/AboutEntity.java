package th.mfu.QA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AboutEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Descrip ;
    public AboutEntity(){
        
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescrip() {
        return Descrip;
    }
    public void setDescrip(String descrip) {
        Descrip = descrip;
    }
    
}
