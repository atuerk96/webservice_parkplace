package com.example.webservice_parkplace.Service;

import com.example.webservice_parkplace.Entitys.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    List<Reservation> findAllById(int id);
}