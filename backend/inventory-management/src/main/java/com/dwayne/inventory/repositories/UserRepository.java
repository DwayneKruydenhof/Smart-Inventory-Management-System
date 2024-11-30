package com.dwayne.inventory.repositories;

import com.dwayne.inventory.entities.User;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Registered
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional findByUsername(String username);
}
