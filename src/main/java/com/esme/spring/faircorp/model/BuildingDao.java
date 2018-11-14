package com.esme.spring.faircorp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface BuildingDao extends JpaRepository<Building, Long>{

    Building findByName(String name);
}