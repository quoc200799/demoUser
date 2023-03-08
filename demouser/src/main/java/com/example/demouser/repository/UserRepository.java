package com.example.demouser.repository;

import com.example.demouser.db.UserDb;
import com.example.demouser.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class UserRepository {
    public ArrayList<User> findAllUsers(){
        return UserDb.users;
    }

}
