package com.fleetmanagement.fleetapp.repository;

import com.fleetmanagement.fleetapp.models.VehicleMaintenanceUUU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenanceUUU, Integer> {
}
