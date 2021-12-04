package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveCar(CarDTO dto) {
        if (!repo.existsById(dto.getId())) {
            Car c = mapper.map(dto, Car.class);
            repo.save(c);
        } else {
            throw new RuntimeException("Car already exist..!");
        }
    }

    @Override
    public void updateCar(CarDTO dto) {
        if (repo.existsById(dto.getId())) {
            Car c = mapper.map(dto, Car.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such Car for update..!");
        }
    }

    @Override
    public CarDTO searchCar(String id) {
        Optional<Car> Car = repo.findById(id);
        if (Car.isPresent()) {
            return mapper.map(Car.get(), CarDTO.class);
        } else {
            throw new RuntimeException("No Car for id: " + id);
        }
    }

    @Override
    public void deleteCar(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No Car for delete ID: " + id);
        }


    }

    @Override
    public List<CarDTO> getAllCars() {
        List<Car> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CarDTO>>() {
        }.getType());
    }
}

