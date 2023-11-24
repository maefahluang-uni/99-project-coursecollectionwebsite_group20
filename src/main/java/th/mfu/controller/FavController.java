package th.mfu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import th.mfu.repository.FavRepository;
import th.mfu.service.FavService;

@Controller
public class FavController {
    @Autowired
    FavRepository favRepository;
    private final FavService favService;

    /// add dishes to cart /// //<<<<<<<<<<<
    public FavController(FavRepository favRepository, FavService favService) {
        this.favRepository = favRepository;
        this.favService = favService;
    }

    @PostMapping("/add-to-cart/{id}")
    public String addtocart(Model model, @PathVariable Long id,
            @RequestParam("Name") Integer quantity, // pic , name
            @RequestParam("ID") String sweetness) {
        return "redirect:/user";
    }
}
