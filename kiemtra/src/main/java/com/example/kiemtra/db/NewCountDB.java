package com.example.kiemtra.db;

import com.example.kiemtra.model.Course;
import com.example.kiemtra.model.NewCount;
import com.example.kiemtra.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NewCountDB {
    private CourseDB courseDB;
    private UserDB userDB;
    private static List<NewCount> newcountDB ;
    public static List <NewCount> getNewcountDB(){
        for (Course c : CourseDB.courseList) {
            for (User u: UserDB.userList) {
                if(Objects.equals(c.getUserId(), u.getId())){
                    newcountDB = new ArrayList<>(List.of(
                           new NewCount(c.getId(), c.getName(), c.getDecription(),c.getType(),c.getTopics(),c.getThumbnail(),u) ));
                }
            }
        }
        return newcountDB;
    }
}
