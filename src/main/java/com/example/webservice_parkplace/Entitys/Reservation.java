package com.example.webservice_parkplace.Entitys;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "room")
    private int room;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
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
        return Objects.hash(id, room);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
