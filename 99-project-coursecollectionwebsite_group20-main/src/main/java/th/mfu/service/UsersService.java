package th.mfu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.mfu.model.UsersModel;
import th.mfu.repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersModel registerUser(String login, String password, String email) {
        if (login == null || password == null) {
            return null;
        } else {
            if (usersRepository.findFirstByLogin(login).isPresent()) { // fix
                System.out.println("Duplicate login");
                return null;
            }
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
            return usersRepository.save(usersModel);
        }
    }

    public UsersModel authenticated(String login, String password) {
        return usersRepository.findByLoginAndPassword(login, password).orElse(null); // fix
    }
}
