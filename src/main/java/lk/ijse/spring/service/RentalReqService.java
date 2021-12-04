package lk.ijse.spring.service;

import lk.ijse.spring.dto.RentalReqDTO;

import java.util.List;

public interface RentalReqService {
    void saveRentalReq(RentalReqDTO dto);

    void updateRentalReq(RentalReqDTO dto);

    void deleteRentalReq(String id);

    List<RentalReqDTO> getAllRentalReq();
}
