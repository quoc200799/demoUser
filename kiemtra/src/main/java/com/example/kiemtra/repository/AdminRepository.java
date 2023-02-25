package com.example.kiemtra.repository;

import com.example.kiemtra.db.AdminDB;
import com.example.kiemtra.model.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminRepository {
    public Admin findAllAdmin(){
        return AdminDB.countAdmin();
    }
}
