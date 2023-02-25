package com.example.kiemtra.repository;

import com.example.kiemtra.db.NewCountDB;
import com.example.kiemtra.db.UserDB;
import com.example.kiemtra.model.NewCount;
import com.example.kiemtra.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class NewCourseRepository {
    public List<NewCount> findAllUser(){
        return NewCountDB.getNewcountDB();
    }
}
