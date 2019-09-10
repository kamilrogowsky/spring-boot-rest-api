package com.restapi.springbootrestapi.service;

import com.restapi.springbootrestapi.repository.VehicleRepository;
import com.restapi.springbootrestapi.dto.VehicleDto;
import com.restapi.springbootrestapi.entity.Vehicle;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public VehicleDto getVehicle(Long id){
        if (vehicleRepository.findById(id).isPresent()) {
            Vehicle fetchedVehicle = vehicleRepository.findById(id).get();
            return new VehicleDto(fetchedVehicle.getId(), fetchedVehicle.getName(), fetchedVehicle.getBodyType(), fetchedVehicle.getHorsepower(), fetchedVehicle.getProductionYear());
        }else{
            return null;
        }

    }

    public List<VehicleDto> getAllVehicles() {
        List<VehicleDto> vehicleDtoList = new ArrayList<>();

        vehicleRepository.findAll().forEach(vehicle -> {
            vehicleDtoList.add(new VehicleDto(vehicle.getId(), vehicle.getName(), vehicle.getBodyType(), vehicle.getHorsepower(), vehicle.getProductionYear()));
        });

        return vehicleDtoList;
    }

    public void addVehicle(VehicleDto vehicleDto){
        Vehicle vehicle = new Vehicle();
        vehicle.setName(vehicleDto.getName());
        vehicle.setBodyType((vehicleDto.getBodyType()));
        vehicle.setHorsepower((vehicleDto.getHorsepower()));
        vehicle.setProductionYear((vehicleDto.getReleaseYear()));

        vehicleRepository.save(vehicle);
    }

    public VehicleDto updateVehicle(Long vehicleDtoId, VehicleDto vehicleDto){
        if(vehicleRepository.findById(vehicleDtoId).isPresent()){
            Vehicle existingVehicle = vehicleRepository.findById(vehicleDtoId).get();

            existingVehicle.setName(vehicleDto.getName());
            existingVehicle.setBodyType(vehicleDto.getBodyType());
            existingVehicle.setHorsepower(vehicleDto.getHorsepower());
            existingVehicle.setProductionYear(vehicleDto.getReleaseYear());

            Vehicle updatedVehicle = vehicleRepository.save(existingVehicle);

            return new VehicleDto(updatedVehicle.getId(), updatedVehicle.getName(), updatedVehicle.getBodyType(), updatedVehicle.getHorsepower(), updatedVehicle.getProductionYear());

        } else{
            return null;
        }

    }

    public void deleteVehicle(Long vehicleDtoId){
        if(vehicleRepository.findById(vehicleDtoId).isPresent()){
            Vehicle existingVehicle = vehicleRepository.findById(vehicleDtoId).get();
            vehicleRepository.deleteById(vehicleDtoId);
        }
    }
}
