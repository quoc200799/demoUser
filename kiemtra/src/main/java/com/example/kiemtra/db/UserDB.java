package com.example.kiemtra.db;

import com.example.kiemtra.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    @Autowired
    public static List<User> userList = new ArrayList<>(List.of(
            new User(1,"Nguyễn Văn A","a@gmail.com","0987654321" ,""),
            new User(2,"Nguyễn Văn B","b@gmail.com","0122456789" ,"")
    ));
}
