package com.restapi.springbootrestapi.repository;

import com.restapi.springbootrestapi.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}