package com.example.webservice_parkplace.Service;

import com.example.webservice_parkplace.Entitys.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

public class ReservationService {

    private ReservationRepository reservationsRepository;

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

    public Reservation saveReservation(Reservation reservation)
    {
        reservationsRepository.save(reservation);
        return reservation;
    }


    public RedirectView deleteReservation(int reservationId)
    {
        reservationsRepository.deleteById(reservationId);
        return null;
    }


}
