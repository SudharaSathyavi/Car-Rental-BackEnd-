package lk.ijse.spring.contoller;


import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
@CrossOrigin
public class CarController {

    @Autowired
    CarService carService ;


    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addCar(@RequestBody CarDTO dto) {
        carService.saveCar(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteCar(@RequestParam String id) {
        carService.deleteCar(id);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCar(@RequestBody CarDTO dto) {
        carService.updateCar(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchCar(@PathVariable String id) {
        CarDTO CarDTO = carService.searchCar(id);
        return new ResponseEntity(new StandradResponse(200, "Success", CarDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllCars() {
        List<CarDTO> allCars = carService.getAllCars();
        return new ResponseEntity(new StandradResponse(200, "Success", allCars), HttpStatus.OK);
    }


}
