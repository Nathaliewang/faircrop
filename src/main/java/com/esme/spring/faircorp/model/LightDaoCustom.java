package com.esme.spring.faircorp.model;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface LightDaoCustom {

    List<Light> findOnLights();

}
