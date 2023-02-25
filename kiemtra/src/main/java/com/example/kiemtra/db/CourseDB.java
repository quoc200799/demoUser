package com.example.kiemtra.db;

import com.example.kiemtra.model.Course;
import com.example.kiemtra.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CourseDB {
    private static List<String> topicsnew = new  ArrayList<>(List.of("backend", "java"));
    @Autowired
    public static List<Course> courseList = new ArrayList<>(List.of(
            new Course(1,"Khóa học 1","Mô tả","online",  topicsnew,"",1),
            new Course(2,"Khóa học 2","Mô tả","ofline",  topicsnew,"",2)
    ));


}
