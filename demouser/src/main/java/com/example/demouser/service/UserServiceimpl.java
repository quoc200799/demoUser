package com.example.demouser.service;

import com.example.demouser.exception.NotFoundException;
import com.example.demouser.model.User;
import com.example.demouser.model.dto.UserDto;
import com.example.demouser.model.mapper.UserMapper;
import com.example.demouser.repository.UserRepository;
import com.example.demouser.request.CreateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.*;

@Component
public class UserServiceimpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    private String generateId() {
        String uuid = UUID.randomUUID().toString();
        return uuid;

    }
    public ArrayList<UserDto> getUsers() {
        ArrayList<UserDto> result = new ArrayList<>();
        for (User user : userRepository.findAllUsers()) {
            result.add(UserMapper.toUserDto(user));
        }
        return result;

    }

    public User deleteUser(String id) {
        userRepository.findAllUsers().removeIf(item -> Objects.equals(item.getId(), id));
        return null;
    }

    @Override
    public UserDto getUsersById(String id) {
        for (User user : userRepository.findAllUsers()) {
            if (Objects.equals(user.getId(), id)) {
                return UserMapper.toUserDto(user);
            }
        }
        throw new NotFoundException("User not found");
    }

    @Override
    public User createUser(CreateUserRequest request) {
        //builder thay cho contructor.
        User user = User.builder()
                .id(generateId())
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .phone(request.getPhone())
                .password(request.getPassword())
                .build();
        userRepository.findAllUsers().add(user);
        return user;
    }
    private  void validate(CreateUserRequest request){
        if(request.getName().trim().equals("")){
            throw  new NotFoundException("Title không được để trống");
        }
    }
}
