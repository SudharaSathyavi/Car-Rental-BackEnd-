package lk.ijse.spring.service;

import lk.ijse.spring.dto.RentDTO;
import lk.ijse.spring.dto.RentDTO;

import java.util.List;

public interface RentService {
    void saveRent(RentDTO dto);

    List<RentDTO> getAllRents();
}
