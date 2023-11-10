package th.mfu.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;
    public Long password;
    private String name;
    private String email;

    // Constructor // รวมข้อมูลเข้าตลาสนี้

    public Student(Long id, String name, String email, Long password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter methods เก็บเข้า
    public Long getId() {
        return id; // <<
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

}
