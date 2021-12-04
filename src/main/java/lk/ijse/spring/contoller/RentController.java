package lk.ijse.spring.contoller;

import lk.ijse.spring.dto.RentDTO;
import lk.ijse.spring.service.RentService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rent")
@CrossOrigin
public class RentController {
    @Autowired
    RentService rentService;

    //save
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addRent(@RequestBody RentDTO dto) {
        rentService.saveRent(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }


    //getall
    @GetMapping
    public ResponseEntity getAllCustomershedule() {
        List<RentDTO> allDrivers = rentService.getAllRents();
        return new ResponseEntity(new StandradResponse(200, "Success", allDrivers), HttpStatus.OK);
    }
}
