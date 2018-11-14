package com.esme.spring.faircorp.model;

public class RoomDto {
    private Long id;
    private String name;
    private Integer floor;


    public RoomDto() {
    }

    public RoomDto(Room room) {
        this.id = room.getId();
        this.name=room.getName();
        this.floor = room.getFloor();
    }

    public RoomDto(Building building) {
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
    public Integer getFloor() {
        return floor;
    }


}
