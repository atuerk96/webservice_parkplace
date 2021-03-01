package com.example.webservice_parkplace.Controller;

import com.example.webservice_parkplace.Entitys.Reservation;
import com.example.webservice_parkplace.Service.ReservationRepository;
import com.example.webservice_parkplace.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins="*")
@RestController
public class ReservationController {
    private ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/all_reservations")
    @ResponseBody
    List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping(path = "/addReservation")

    public Reservation addReservation(@RequestBody Reservation reservation){
        return  reservationService.saveReservation(reservation);

    }

    @DeleteMapping(path = "/deleteReservation")
    public RedirectView deleteReservation(@RequestBody Reservation reservation)
    {
        int id = reservation.getId();
        return reservationService.deleteReservation(id);
    }
}
