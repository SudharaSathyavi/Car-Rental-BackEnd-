package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class AdminImpl implements AdminService {
    @Autowired
    AdminRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveAdmin(AdminDTO dto) {
        if (!repo.existsById(dto.getId())) {
            Admin c = mapper.map(dto, Admin.class);
            repo.save(c);
        } else {
            throw new RuntimeException("Admin already exist..!");
        }

    }

    @Override
    public void updateAdmin(AdminDTO dto) {
        if (repo.existsById(dto.getId())) {
            Admin c = mapper.map(dto, Admin.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such Admin for update..!");
        }
    }

    @Override
    public AdminDTO searchAdmin(String id) {
        Optional<Admin> Admin = repo.findById(id);
        if (Admin.isPresent()) {
            return mapper.map(Admin.get(), AdminDTO.class);
        } else {
            throw new RuntimeException("No Admin for id: " + id);
        }
    }

    @Override
    public void deleteAdmin(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No Admin for delete ID: " + id);
        }

    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        List<Admin> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<AdminDTO>>() {
        }.getType());
    }

}
