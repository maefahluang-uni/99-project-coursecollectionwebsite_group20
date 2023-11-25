package th.mfu.QA.Repo;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.springframework.data.repository.CrudRepository;


public interface CommentRepository extends CrudRepository<Comment, Long> {
       public List<Comment> findByTitleEntityId(Long titleEntityId);
    public List<Comment> deleteByTitleEntityId(long id);
}
