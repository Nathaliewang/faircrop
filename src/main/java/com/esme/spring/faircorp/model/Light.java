package com.esme.spring.faircorp.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Light {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Integer level;

    private String name;


    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Room room;

    public Light() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Light(Room room, Integer level, Status status) {
        this.level = level;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


}


