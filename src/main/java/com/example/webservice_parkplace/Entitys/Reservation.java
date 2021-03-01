package com.example.webservice_parkplace.Entitys;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "reservationStart")
    private String r_start;

    @Column(name="reservationEnd")
    private String r_end;

    @Column(name="placeId")
    private int p_id;

    @Column(name="userId")
    private int u_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getR_start() {
        return r_start;
    }

    public void setR_start(String r_start) {
        this.r_start = r_start;
    }

    public String getR_end() {return r_end;}

    public void setR_end(String r_end) {
        this.r_end = r_end;
    }

    public int getP_id() {
        return p_id;
    }
    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation reservation = (Reservation) o;
        return id == reservation.id && Objects.equals(this.id, reservation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, r_start, r_end, u_id, p_id);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
