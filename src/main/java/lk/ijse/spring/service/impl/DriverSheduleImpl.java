package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverSheduleDTO;
import lk.ijse.spring.entity.DriverShedule;
import lk.ijse.spring.repo.DriverSheduleRepo;
import lk.ijse.spring.service.DriverSheduleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class DriverSheduleImpl implements DriverSheduleService {

    @Autowired
    DriverSheduleRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveDriverShedule(DriverSheduleDTO dto) {
        if (!repo.existsById(dto.getId())) {
            DriverShedule c = mapper.map(dto, DriverShedule.class);
            repo.save(c);
        } else {
            throw new RuntimeException("DiverShedule already exist..!");
        }

    }

    @Override
    public void updateDriverShedule(DriverSheduleDTO dto) {
        if (repo.existsById(dto.getId())) {
            DriverShedule c = mapper.map(dto, DriverShedule.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such DriverShedule for update..!");
        }
    }

    @Override
    public void deleteDriverShedule(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No customer for delete ID: " + id);
        }

    }

    @Override
    public List<DriverSheduleDTO> getAllDriverShedule() {
        List<DriverShedule> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<DriverSheduleDTO>>() {
        }.getType());
    }
}

