package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.DriverSheduleDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.Driverservice;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DriverServiceImpl implements Driverservice {
    @Autowired
    DriverRepo repo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void saveDriver(DriverDTO dto) {
        if (!repo.existsById(dto.getId())) {
            Driver d = mapper.map(dto, Driver.class);
            repo.save(d);
        } else {
            throw new RuntimeException("Driver already exist..!");
        }

    }

    @Override
    public void updateDriver(DriverDTO dto) {
        if (repo.existsById(dto.getId())) {
            Driver d = mapper.map(dto, Driver.class);
            repo.save(d);
        } else {
            throw new RuntimeException("No such Driver for update..!");
        }

    }

    @Override
    public void deleteDriver(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No Driver for delete ID: " + id);
        }

    }

    @Override
    public List<DriverDTO> getAllDrivers() {

        List<Driver> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<DriverSheduleDTO>>() {
        }.getType());
    }
}
