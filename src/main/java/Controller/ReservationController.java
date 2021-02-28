package Controller;

import Services.ReservationRepository;
import com.example.webservice_parkplace.Entitys.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.awt.*;
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

    public RedirectView createReservation(@RequestParam Map<Integer, Integer> map) {
        Reservation newReservation = new Reservation();
        newReservation.setId(map.get("id"));
        newReservation.setRoom(map.get("room"));
        ReservationService.saveReservation(newReservation);
        return new RedirectView("https://webservice-parkplace.herokuapp.com/");


    }

    @PostMapping(path = "/deleteReservation")
    public RedirectView deleteReservation(@RequestParam Map<Integer, Integer> map)
    {
        reservationService.deleteReservation(map.get("reservationIdToDelete"));
        return new RedirectView("https://webservice-parkplace.herokuapp.com/");
    }
}
