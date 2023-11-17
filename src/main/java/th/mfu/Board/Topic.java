package th.mfu.Board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long boardid;
    private String headerTopic;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getHeaderTopic() {
        return headerTopic;
    }
    public void setHeaderTopic(String headerTopic) {
        this.headerTopic = headerTopic;
    }

}
