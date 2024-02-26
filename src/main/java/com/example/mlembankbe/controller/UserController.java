package com.example.mlembankbe.controller;

import com.example.mlembankbe.domain.UserTable;
import com.example.mlembankbe.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("user/{username}")
    public ResponseEntity<UserTable> getUserByUsername(@PathVariable String username) {
        // Trovare l'utente dal DB in base al suo `username`
        Optional<UserTable> user = userRepository.findByUsername(username);

        if (user.isPresent())
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("users")
    public ResponseEntity<List<UserTable>> getUsers() {
        // Trova tutti gli utenti
        List<UserTable> user = userRepository.findAll();

        if (!user.isEmpty())
            return new ResponseEntity<>(user, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
