package lk.ijse.spring.service;

import lk.ijse.spring.contoller.HandOverController;
import lk.ijse.spring.dto.HandOverDTO;
import lk.ijse.spring.dto.HandOverDTO;

import java.util.List;

public interface HandOverService {

    void saveHandOver(HandOverDTO dto);

    List<HandOverDTO> getAllHandOver();
}
