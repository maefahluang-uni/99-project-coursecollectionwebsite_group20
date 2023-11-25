package th.mfu.QA.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String comment;
    
    public Comment(Long id, String comment, TitleEntity titleEntity) {
        this.id = id;
        this.comment = comment;
        this.titleEntity = titleEntity;
    }
    public Comment(){
        
    }
    @ManyToOne(cascade = CascadeType.MERGE)
    private TitleEntity titleEntity;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public TitleEntity getTitleEntity() {
        return titleEntity;
    }
    public void setTitleEntity(TitleEntity titleEntity) {
        this.titleEntity = titleEntity;
    }
    

    
}
