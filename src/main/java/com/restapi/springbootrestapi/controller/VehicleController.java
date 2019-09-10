package com.restapi.springbootrestapi.controller;

import com.restapi.springbootrestapi.dto.VehicleDto;
import com.restapi.springbootrestapi.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rental")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;

    }

    @PostMapping("/vehicle")
    public void addVehicle(@RequestBody VehicleDto vehicleDto){
        vehicleService.addVehicle(vehicleDto);

    }

    @GetMapping("/vehicle/{id}")
    public VehicleDto getVehicle(@PathVariable(value = "id") Long vehicleId){
        return vehicleService.getVehicle(vehicleId);
    }

    @GetMapping("/vehicles")
    public List<VehicleDto> getAllVehicles(){
        return vehicleService.getAllVehicles();
    }

    @PutMapping("/vehicle/{id}")
    public VehicleDto updateVehicle(@PathVariable(value = "id") Long vehicleDtoId, @RequestBody VehicleDto vehicleDto){
        return vehicleService.updateVehicle(vehicleDtoId, vehicleDto);
    }

    @DeleteMapping("/vehicle/{id}")
    public void deleteVehicle(@PathVariable(value = "id") Long vehicleDtoId){
        vehicleService.deleteVehicle(vehicleDtoId);
    }
}
