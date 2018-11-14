package com.esme.spring.faircorp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Building {

    @GeneratedValue
    @Id
    private Long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy="building")
    private List<Room> rooms;

    public Building(){}
    public Building(Long id, @NotNull String name) {
        this.id = id;
        this.name = name;
        //this.floor = floor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public Integer getFloor() {
        //return floor;
    //}

    //public void setFloor(Integer floor) {
        //this.floor = floor;
    //}

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
