package th.mfu.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import th.mfu.model.UsersModel;

public interface UsersRepository extends JpaRepository<UsersModel, Integer> {

    Optional<UsersModel> findByLoginAndPassword(String login, String password);

    Optional<UsersModel> findFirstByLogin(String login);
}