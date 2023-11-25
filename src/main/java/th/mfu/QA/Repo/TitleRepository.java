package th.mfu.QA.Repo;

import org.springframework.data.repository.CrudRepository;

import th.mfu.QA.model.TitleEntity;


public interface TitleRepository extends CrudRepository<TitleEntity, Long> {
      
}