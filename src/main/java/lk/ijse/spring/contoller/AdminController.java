package lk.ijse.spring.contoller;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.service.AdminService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminservice;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addAdmin(@RequestBody AdminDTO dto) {
        adminservice.saveAdmin(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteAdmin(@RequestParam String id) {
        adminservice.deleteAdmin(id);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateAdmin(@RequestBody AdminDTO dto) {
        adminservice.updateAdmin(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchAdmin(@PathVariable String id) {
        AdminDTO AdminDTO = adminservice.searchAdmin(id);

        return new ResponseEntity(new StandradResponse(200, "Success", AdminDTO), HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity getAllAdmins() {
        List<AdminDTO> allAdmins = adminservice.getAllAdmins();
        return new ResponseEntity(new StandradResponse(200, "Success", allAdmins), HttpStatus.OK);
    }

}
