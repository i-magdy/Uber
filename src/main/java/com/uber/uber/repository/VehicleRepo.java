package com.uber.uber.repository;

import com.uber.uber.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository <Vehicle, Integer> {
}
