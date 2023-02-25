package com.example.kiemtra.service;

import com.example.kiemtra.model.Admin;
import com.example.kiemtra.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private AdminRepository adminRepository;
    private Admin adminList(){
        return adminRepository.findAllAdmin();
    }
}
