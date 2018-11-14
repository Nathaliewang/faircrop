package com.esme.spring.faircorp.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Room {

    @GeneratedValue
    @Id
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Integer floor;


    @OneToMany(mappedBy="room")
    private List<Light> lights;
    @ManyToOne
    private Building building;

    public Room(){}
    public Room(@NotNull String name, @NotNull Integer floor) {
        //this.id = id;
        this.name = name;
        this.floor = floor;
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

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public List<Light> getLights() {
        return lights;
    }

    public void setLights(List<Light> lights) {
        this.lights = lights;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
