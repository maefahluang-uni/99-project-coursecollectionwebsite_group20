package th.mfu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dish_name;
    private String dish_dis;
    private String dish_picture;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Course(Long id, String dish_name, String dish_dis, String dish_picture, User user) {
        this.id = id;
        this.dish_name = dish_name;
        this.dish_dis = dish_dis;
        this.dish_picture = dish_picture;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public String getDish_type() {
        return dish_dis;
    }

    public void setDish_dis(String dish_dis) {
        this.dish_dis = dish_dis;
    }

    public String getDish_picture() {
        return dish_picture;
    }

    public void setDish_picture(String dish_picture) {
        this.dish_picture = dish_picture;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Constructors, getters, and setters
}
