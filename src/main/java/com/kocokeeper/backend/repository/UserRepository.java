package com.kocokeeper.backend.repository;

import java.util.Optional;

import com.kocokeeper.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
