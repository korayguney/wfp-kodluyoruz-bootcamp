package dev.patika.patika06.controller;

import dev.patika.patika06.dto.VehicleDTO;
import dev.patika.patika06.models.Vehicle;
import dev.patika.patika06.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;


    @PostMapping("/vehicles")
    public Vehicle saveVehicle(@RequestBody VehicleDTO vehicle){
        return vehicleService.saveVehicle(vehicle);
    }




}
