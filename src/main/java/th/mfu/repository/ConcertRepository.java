package th.mfu.repository;
import org.springframework.data.repository.CrudRepository;

import th.mfu.model.Concert;

public interface ConcertRepository extends CrudRepository<Concert, Long> {
      
}