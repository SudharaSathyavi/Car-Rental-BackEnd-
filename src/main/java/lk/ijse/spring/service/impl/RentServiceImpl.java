package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RentDTO;
import lk.ijse.spring.dto.RentalReqDTO;
import lk.ijse.spring.entity.DriverShedule;
import lk.ijse.spring.entity.Rent;
import lk.ijse.spring.entity.RentalReq;
import lk.ijse.spring.repo.RentRepo;
import lk.ijse.spring.service.RentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RentServiceImpl implements RentService {

    @Autowired
    RentRepo repo;
    @Autowired
    ModelMapper mapper;

    @Override
    public void saveRent(RentDTO dto) {
        if (!repo.existsById(dto.getId())) {
            Rent c = mapper.map(dto, Rent.class);
            repo.save(c);
        } else {
            throw new RuntimeException("Rent already exist..!");
        }
    }

    @Override
    public List<RentDTO> getAllRents() {
        List<Rent> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<RentDTO>>() {
        }.getType());
    }
}
