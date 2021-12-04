package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RentDTO;
import lk.ijse.spring.dto.RentalReqDTO;
import lk.ijse.spring.entity.RentalReq;
import lk.ijse.spring.repo.RentalReqRepo;
import lk.ijse.spring.service.RentalReqService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RentalReqServiceImpl implements RentalReqService {

    @Autowired
    RentalReqRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveRentalReq(RentalReqDTO dto) {
        System.out.println(dto.toString());
        if (!repo.existsById(dto.getRentalid())) {
            RentalReq c = mapper.map(dto, RentalReq.class);
            repo.save(c);
        } else {
            throw new RuntimeException("DiverShedule already exist..!");
        }
    }

    @Override
    public void updateRentalReq(RentalReqDTO dto) {

        if (repo.existsById(dto.getRentalid())) {
            RentalReq c = mapper.map(dto, RentalReq.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such RentalReq for update..!");
        }


    }

    @Override
    public void deleteRentalReq(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No customer for delete ID: " + id);
        }
    }

    @Override
    public List<RentalReqDTO> getAllRentalReq() {
        List<RentalReq> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<RentalReqDTO>>() {
        }.getType());
    }
}

