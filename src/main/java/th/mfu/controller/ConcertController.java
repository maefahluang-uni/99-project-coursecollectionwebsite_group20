package th.mfu.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import th.mfu.model.Concert;
import th.mfu.model.Reservation;
import th.mfu.model.Seat;
import th.mfu.repository.ConcertRepository;
import th.mfu.repository.ReservationRepository;
import th.mfu.repository.SeatRepository;

@Controller
public class ConcertController {
    @Autowired
    ConcertRepository concertRepo;

    @Autowired
    SeatRepository seatRepo;

    @Autowired
    ReservationRepository reservationRepo;

    
    @GetMapping("/book") // Add proper annotation for GET method
    public String book(Model model) {


        model.addAttribute("concerts", concertRepo.findAll());
        return "book";
    }

    
    @GetMapping("/book/concerts/{concertId}") // Add proper annotation for GET method
    public String reserveSeatForm(@PathVariable Long concertId, Model model) {
    
        Reservation emptyReservation = new Reservation();
        model.addAttribute("concert", concertRepo.findById(concertId).orElse(null));
        model.addAttribute("reservation", emptyReservation);

        List<Seat> availableSeats = seatRepo.findByBookedFalseAndConcertId(concertId);
        model.addAttribute("seats", availableSeats);
        return "reserve-seat";
    }

    @Transactional
    @PostMapping("/book/concerts/{concertId}") // Add proper annotation for POST method
    public String reserveSeat(@ModelAttribute Reservation reservation, @PathVariable Long concertId, Model model) {



        Seat selecSeat = seatRepo.findById(reservation.getSeat().getId()).orElse(null);

        if (selecSeat != null) {
            selecSeat.setBooked(true);
            seatRepo.save(selecSeat);
            reservationRepo.save(reservation);
            return "redirect:/book";
        } else {
            return "error-page";
        }
    }



    @GetMapping("/concerts")
    public String listConcerts(Model model) {
        model.addAttribute("concerts", concertRepo.findAll());
        return "list-concert";
    }

    @GetMapping("/add-concert")
    public String addAConcertForm(Model model) {
        model.addAttribute("concert", new Concert());
        return "add-concert-form";
    }

    @PostMapping("/concerts")
    public String saveConcert(@ModelAttribute Concert concert) {
        concertRepo.save(concert);
        return "redirect:/concerts";
    }

    @Transactional
    @GetMapping("/delete-concert/{id}")
    public String deleteConcert(@PathVariable long id) {
        seatRepo.deleteByConcertId(id);
        concertRepo.deleteById(id);
        return "redirect:/concerts";
    }

    @GetMapping("/concerts/{id}/seats")
    public String showAddSeatForm(Model model, @PathVariable Long id) {
        model.addAttribute("seats", seatRepo.findByConcertId(id));

        Concert concert = concertRepo.findById(id).get();
        Seat seat = new Seat();
        seat.setConcert(concert);
        model.addAttribute("newseat", seat);
        return "seat-mgmt";
    }

    @PostMapping("/concerts/{id}/seats")
    public String saveSeat(@ModelAttribute Seat newseat, @PathVariable Long id) {
        Concert concert = concertRepo.findById(id).get();
        newseat.setConcert(concert);
        seatRepo.save(newseat);
        return "redirect:/concerts/" + id + "/seats";
    }
}