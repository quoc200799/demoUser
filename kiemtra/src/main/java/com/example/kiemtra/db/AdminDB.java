package com.example.kiemtra.db;

import com.example.kiemtra.model.Admin;
import com.example.kiemtra.model.Course;
import com.example.kiemtra.model.NewCount;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AdminDB {
    private static Admin admin;
    private static NewCountDB courseDB;

    private static List<NewCount> courseAdmin = courseDB.getNewcountDB();
    private static Integer totalItem = courseAdmin.size();

    private static Integer totalPages() {
        int count = 1;
        if (totalItem > 10 * count) {
            count++;
        }
        return count;
    }

    private static Integer pageSize() {
        if (Objects.equals(pageSize(), totalPages())) {
            return totalItem - 10 * totalPages();
        } else {
            return 10;
        }
    }

    private static Integer currentPage() {
            return pageSize() % 10;
    }

    public static Admin countAdmin() {
        return new Admin(currentPage(), pageSize(), totalPages(), totalItem, courseAdmin);
    }


}
