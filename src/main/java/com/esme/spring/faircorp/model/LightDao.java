package com.esme.spring.faircorp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LightDao extends JpaRepository<Light, Long>, LightDaoCustom {

    List<Light> findByRoomId(Long roomId);
    List<Light> findByName(String name);

    //@Query("select l from Light l where l.name=:name")
    //Light findByName(@Param("name") String name);
    //@Modifying
    //@Query("delete from Light l where l.name=?1")
    //void deleteByName(String name);
}

