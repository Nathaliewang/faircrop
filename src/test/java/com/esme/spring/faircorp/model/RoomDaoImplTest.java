package com.esme.spring.faircorp.model;

import org.assertj.core.groups.Tuple;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan
public class RoomDaoImplTest {

    @Autowired
    RoomDao roomDao;

    @Test
    public void shouldFindOnRoom() {
        assertThat(roomDao.findByName("Room1").getFloor()).isEqualTo(1);
    }
}
