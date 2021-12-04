package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.HandOverDTO;
import lk.ijse.spring.entity.HandOver;
import lk.ijse.spring.repo.HandOverRepo;
import lk.ijse.spring.service.HandOverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class HandOverImpl implements HandOverService {

    @Autowired
    HandOverRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveHandOver(HandOverDTO dto) {
        if (!repo.existsById(dto.getHoid())) {
            HandOver c = mapper.map(dto, HandOver.class);
            repo.save(c);
        } else {
            throw new RuntimeException("HandOver already exist..!");
        }

    }

    @Override
    public List<HandOverDTO> getAllHandOver() {
        List<HandOver> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<HandOverDTO>>() {
        }.getType());
    }
}
