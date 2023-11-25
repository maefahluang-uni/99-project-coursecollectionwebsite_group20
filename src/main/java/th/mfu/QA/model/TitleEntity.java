package th.mfu.QA.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TitleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @OneToOne(cascade = CascadeType.ALL)
    private AboutEntity aboutEntity;
    public TitleEntity() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AboutEntity getAboutEntity() {
        return aboutEntity;
    }

    public void setAboutEntity(AboutEntity aboutEntity) {
        this.aboutEntity = aboutEntity;
    }
}
