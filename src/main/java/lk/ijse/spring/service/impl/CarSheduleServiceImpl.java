package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarSheduleDTO;
import lk.ijse.spring.entity.CarShedule;
import lk.ijse.spring.repo.CarSheduleRepo;
import lk.ijse.spring.service.CarSheduleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CarSheduleServiceImpl implements CarSheduleService {

    @Autowired
    CarSheduleRepo repo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void saveCarShedule(CarSheduleDTO dto) {
        if (!repo.existsById(dto.getId())) {
            CarShedule c = mapper.map(dto, CarShedule.class);
            repo.save(c);
        } else {
            throw new RuntimeException("CarShedule already exist..!");
        }

    }

    @Override
    public void updateCarShedule(CarSheduleDTO dto) {
        if (repo.existsById(dto.getId())) {
            CarShedule c = mapper.map(dto, CarShedule.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such CarShedule for update..!");
        }
    }


    @Override
    public void deleteCarShedule(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No CarShedule for delete ID: " + id);
        }

    }

    @Override
    public List<CarSheduleDTO> getAllCarsShedule() {
        List<CarShedule> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CarSheduleDTO>>() {
        }.getType());
    }
}

