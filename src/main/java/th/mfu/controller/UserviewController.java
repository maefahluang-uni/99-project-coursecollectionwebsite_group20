package th.mfu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import th.mfu.service.UsersService;

public class UserviewController {
    private final UsersService usersService;

    public UserviewController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/user")
    public String listforUser(Model model, String keyword) {
        // model.addAttribute("dishes", dishesRepo.findAll());
        // only show InvoiceItem that invoice = null
        model.addAttribute("invoiceitem", invoiceItemRepo.findByInvoiceIsNull());
        return "user";
    }

}
