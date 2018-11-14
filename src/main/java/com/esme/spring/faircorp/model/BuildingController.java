package com.esme.spring.faircorp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RestController  // (1)
@RequestMapping("/api/building") // (2)
@Transactional // (3)
public class BuildingController {

    @Autowired
    private LightDao lightDao; // (4)
    @Autowired
    private RoomDao roomDao;
    @Autowired
    private BuildingDao buildingDao; // (4)


    @GetMapping // (5)
    public List<BuildingDto> findAll() {
        return buildingDao.findAll()
                .stream()
                .map(BuildingDto::new)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public BuildingDto findById(@PathVariable Long id) {
        return buildingDao.findById(id).map(building -> new BuildingDto(building)).orElse(null);
    }

    @PutMapping(path = "/{id}/switch")
    public BuildingDto switchStatus(@PathVariable Long id) {
        Building building = buildingDao.findById(id).orElseThrow(IllegalArgumentException::new);
        return new BuildingDto(building);
    }

    @PostMapping
    public BuildingDto create(@RequestBody BuildingDto dto) {
        Building building = null;
        if (dto.getId() != null) {
            building = buildingDao.findById(dto.getId()).orElse(null);
        }

        if (building == null) {
            building = buildingDao.save(new Building(dto.getId(),dto.getName()));
        } else {
            building.setName(dto.getName());
            //room.setFloor(dto.getFloor());
            buildingDao.save(building);
        }

        return new BuildingDto(building);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        buildingDao.deleteById(id);
    }
}