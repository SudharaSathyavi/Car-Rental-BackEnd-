package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverSheduleDTO;

import java.util.List;

public interface DriverSheduleService {
    void saveDriverShedule(DriverSheduleDTO dto);

    void updateDriverShedule(DriverSheduleDTO dto);

    void deleteDriverShedule(String id);

    List<DriverSheduleDTO> getAllDriverShedule();
}
