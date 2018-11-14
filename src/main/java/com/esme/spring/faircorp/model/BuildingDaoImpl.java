package com.esme.spring.faircorp.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BuildingDaoImpl implements BuildingDaoCustom {
    @PersistenceContext
    private EntityManager em;

    //@Override
    //public Building findById(Long id) {
        //String jpql = "select l from Building b join b.rooms r join r.lights l where b.id = :id";
        //return em.createQuery(jpql, Building.class).setParameter("id", id).getResultList();
    //}
}
