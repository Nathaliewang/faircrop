package com.esme.spring.faircorp.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RoomDaoImpl implements RoomDaoCustom {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Room findByName(String name) {
        String jpql = "select room from Room room where room.name = :name";
        return em.createQuery(jpql, Room.class).setParameter("name", name).getSingleResult();

    }
}
