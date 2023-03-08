package com.example.demouser.controller;

import com.example.demouser.db.UserDb;
import com.example.demouser.model.User;
import com.example.demouser.model.dto.UserDto;
import com.example.demouser.request.CreateUserRequest;
import com.example.demouser.service.UserService;
import com.example.demouser.service.UserServiceimpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getUsers() {
        ArrayList<UserDto> usersDtos = userService.getUsers();
        return ResponseEntity.status(HttpStatus.OK).body(usersDtos);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUsersById(@PathVariable String id) {
        UserDto usersDto = userService.getUsersById(id);
        return ResponseEntity.ok(usersDto);

    }
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED) //201
    public User createTodo(@Validated @RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }
    @DeleteMapping("/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    public User deleteUser(@PathVariable String id) {
        return userService.deleteUser(id);
    }
}
