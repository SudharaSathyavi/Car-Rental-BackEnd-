package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDTO;

import java.util.List;

public interface Driverservice {
    void saveDriver(DriverDTO dto);

    void updateDriver(DriverDTO dto);

    void deleteDriver(String id);

    List<DriverDTO> getAllDrivers();
}
