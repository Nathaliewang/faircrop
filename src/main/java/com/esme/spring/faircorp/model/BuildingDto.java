package com.esme.spring.faircorp.model;

public class BuildingDto {
    private Long id;
    private String name;


    public BuildingDto() {
    }

    public BuildingDto(Building building) {
        this.id = building.getId();
        this.name=building.getName();
    }

    public Long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    //public Long getRoomId(){
        //return roomId;
    //}
    //public Integer getFloor() {
        //return floor;
    //}


}
