package lk.ijse.spring.contoller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.Driverservice;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    Driverservice driverservice;

    //add
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addDiver(@RequestBody DriverDTO dto) {
        driverservice.saveDriver(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    //delete
    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteDriver(@RequestParam String id) {
        driverservice.deleteDriver(id);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
    }

    //update
    @PutMapping
    public ResponseEntity updateDriver(@RequestBody DriverDTO dto) {
        driverservice.updateDriver(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    //getall
    @GetMapping
    public ResponseEntity getAllCustomers() {
        List<DriverDTO> allDrivers = driverservice.getAllDrivers();
        return new ResponseEntity(new StandradResponse(200, "Success", allDrivers), HttpStatus.OK);
    }

}

