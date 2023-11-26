package th.mfu.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import th.mfu.model.Concert;
import th.mfu.model.Seat;
import th.mfu.repository.ConcertRepository;
import th.mfu.repository.SeatRepository;

@Controller
public class ConcertController {
    @Autowired
    ConcertRepository concertRepo;
    @Autowired
    SeatRepository seatRepo;

    @GetMapping("/board")
    public String listConcerts(Model model) {
        model.addAttribute("concerts", concertRepo.findAll());
        return "/รวม/main";
    }

    @GetMapping("/cd")
    public String Showmain(Model model) {
        model.addAttribute("concerts", concertRepo.findAll());
        return "/รวม/news";
    }

    @GetMapping("/add-board")
    public String addAConcertForm(Model model) {
        model.addAttribute("concert", new Concert());
        return "add-concert-form";
    }

    @PostMapping("/board")
    public String saveConcert(@ModelAttribute Concert concert) {
        concertRepo.save(concert);
        return "redirect:/board";
    }

    @Transactional
    @GetMapping("/delete-board/{id}")
    public String deleteConcert(@PathVariable long id) {
        seatRepo.deleteByConcertId(id);
        concertRepo.deleteById(id);
        return "redirect:/board";
    }

    @GetMapping("/board/{id}/chat")
    public String showAddSeatForm(Model model, @PathVariable Long id) {
        model.addAttribute("seats", seatRepo.findByConcertId(id));

        Concert concert = concertRepo.findById(id).get();
        Seat seat = new Seat();
        seat.setConcert(concert);
        model.addAttribute("newseat", seat);
        return "seat-mgmt";
    }

    @PostMapping("board/{id}/chat")
    public String saveSeat(@ModelAttribute Seat newseat, @PathVariable Long id) {
        Concert concert = concertRepo.findById(id).get();
        newseat.setConcert(concert);
        seatRepo.save(newseat);
        return "redirect:/board/" + id + "/chat";
    }

}