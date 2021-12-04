package lk.ijse.spring.contoller;

import lk.ijse.spring.dto.DriverSheduleDTO;
import lk.ijse.spring.service.DriverSheduleService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drivershedule")
@CrossOrigin
public class DriverSheduleController {
    @Autowired
    DriverSheduleService driverSheduleService;

    //add
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addDiverShedule(@RequestBody DriverSheduleDTO dto) {
        driverSheduleService.saveDriverShedule(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    //delete
    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteDrivershedule(@RequestParam String id) {
        driverSheduleService.deleteDriverShedule(id);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
    }

    //update
    @PutMapping
    public ResponseEntity updateDrivershedule(@RequestBody DriverSheduleDTO dto) {
        driverSheduleService.updateDriverShedule(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    //getall
    @GetMapping
    public ResponseEntity getAllCustomershedule() {
        List<DriverSheduleDTO> allDrivers = driverSheduleService.getAllDriverShedule();
        return new ResponseEntity(new StandradResponse(200, "Success", allDrivers), HttpStatus.OK);
    }

}
