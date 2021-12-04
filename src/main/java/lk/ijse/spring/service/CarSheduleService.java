package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarSheduleDTO;

import java.util.List;

public interface CarSheduleService {

    void saveCarShedule(CarSheduleDTO dto);

    void updateCarShedule(CarSheduleDTO dto);

    void deleteCarShedule(String id);

    List<CarSheduleDTO> getAllCarsShedule();
}
