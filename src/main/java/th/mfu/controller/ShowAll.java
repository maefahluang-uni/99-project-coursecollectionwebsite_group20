package th.mfu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.mfu.model.UsersModel;
import th.mfu.repository.UsersRepository;
import th.mfu.service.UsersService;

@RestController
@RequestMapping("/api/users")
public class ShowAll {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/all")
    public List<UsersModel> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/showall")
    public String showProducts(Model model) {
        List<UsersModel> usersList = usersRepository.findAll();
        model.addAttribute("users", usersList);
        return "index"; // นำไปใช้กับ Thymeleaf template
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        usersService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public UsersModel editUser(@PathVariable Integer id, @RequestBody UsersModel updatedUser) {
        return usersService.updateUser(id, updatedUser.getLogin(), updatedUser.getPassword(), updatedUser.getEmail());
    }
}
