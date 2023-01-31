package com.fleetmanagement.fleetapp.repository;

import com.fleetmanagement.fleetapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
