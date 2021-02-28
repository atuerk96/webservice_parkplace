package Controller;

import Services.ReservationRepository;
import com.example.webservice_parkplace.Entitys.Reservation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservationService {

    private static ReservationRepository reservationsRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationsRepository){
        this.reservationsRepository = reservationsRepository;
    }
    public List<Reservation> getAllReservations() {
        return reservationsRepository.findAll();
    }

    public List<Reservation> findreservationsById(int reservationsId) {
        return reservationsRepository.findAllById(reservationsId);
    }

    public static void saveReservation(Reservation reservation)
    {
        reservationsRepository.save(reservation);
    }


    public void deleteReservation(int reservationId)
    {
        reservationsRepository.deleteById(reservationId);
    }


}
