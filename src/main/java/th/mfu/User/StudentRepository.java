package th.mfu.User;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    // เพิ่มเมธอดที่คุณต้องการได้ตรงนี้
}
