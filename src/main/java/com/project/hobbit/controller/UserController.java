package com.project.hobbit.controller;

import com.project.hobbit.model.*;
import com.project.hobbit.repo.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/v1")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(value = "/user/create")
    public User postUser(@RequestBody User user) {
        return userRepository.save(new User(user.getName(), user.getSurname(), user.getEmail(), user.getCellNum(), user.getPassword()));
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @DeleteMapping(value = "/user/delete/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable("id") UUID id) {
        userRepository.deleteById(id);
        return new ResponseEntity<>("Utente cancellato correttamente", HttpStatus.OK);
    }

    @PutMapping(value = "/user/{id}")
    public ResponseEntity<User> putUser(@PathVariable("id") UUID id, @RequestBody User user) {
        Optional<User> userData = userRepository.findById(id);
        if (userData.isPresent()) {
            User _user = userData.get();
            _user.setName(user.getName());
            _user.setSurname(user.getSurname());
            if (user.getEmail() != null) {
                _user.setEmail(user.getEmail());
            }
            return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
