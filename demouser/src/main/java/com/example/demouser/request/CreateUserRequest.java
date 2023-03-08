package com.example.demouser.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
}
