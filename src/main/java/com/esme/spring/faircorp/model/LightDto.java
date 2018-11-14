package com.esme.spring.faircorp.model;

public class LightDto {

    private Long id;
    private Integer level;
    private Status status;
    private Long roomId;

    public LightDto() {
    }

    public LightDto(Light light) {
        this.id = light.getId();
        this.level = light.getLevel();
        this.status = light.getStatus();
    }

    public LightDto(Room room) {
    }

    public Long getId() {
        return id;
    }
    public Long getRoomId(){
        return roomId;
    }
    public Integer getLevel() {
        return level;
    }

    public Status getStatus() {
        return status;
    }

}