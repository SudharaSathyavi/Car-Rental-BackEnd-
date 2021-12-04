package lk.ijse.spring.contoller;

import lk.ijse.spring.dto.RentalReqDTO;
import lk.ijse.spring.service.RentalReqService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rentreq")
@CrossOrigin
public class RentalReqController {
    @Autowired
    RentalReqService rentalReqService;

    //add
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addDiverShedule(@RequestBody RentalReqDTO dto) {
        rentalReqService.saveRentalReq(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    //delete
    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteRentalReq(@RequestParam String id) {
        rentalReqService.deleteRentalReq(id);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
    }

    //update
    @PutMapping
    public ResponseEntity updateRentalReq(@RequestBody RentalReqDTO dto) {
        rentalReqService.updateRentalReq(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    //getall
    @GetMapping
    public ResponseEntity getAllCars() {
        List<RentalReqDTO> allreq = rentalReqService.getAllRentalReq();
        return new ResponseEntity(new StandradResponse(200, "Success", allreq), HttpStatus.OK);
    }

}
