package com.example.bananabankbe.repository;

import com.example.bananabankbe.domain.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserTable, Long> {
    Optional<UserTable> findByUsername(String username);
}
