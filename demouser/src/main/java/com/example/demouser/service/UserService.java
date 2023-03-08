package com.example.demouser.service;

import com.example.demouser.model.User;
import com.example.demouser.model.dto.UserDto;
import com.example.demouser.request.CreateUserRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public interface UserService {
    public ArrayList<UserDto> getUsers();
    public User deleteUser(String id);
    public UserDto getUsersById(String id);
    public User createUser(CreateUserRequest createUserRequest);
}
