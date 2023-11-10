package th.mfu.User;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentSevice {

    public List<Student> getStudens() {
        return List.of(
                new Student(
                        135123L, "Jakapong",
                        "Jakapong@email.com",
                        125151232L));
    }
}