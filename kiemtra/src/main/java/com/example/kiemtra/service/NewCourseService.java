package com.example.kiemtra.service;

import com.example.kiemtra.db.NewCountDB;
import com.example.kiemtra.exception.NotFoundException;
import com.example.kiemtra.model.NewCount;
import com.example.kiemtra.repository.NewCourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class NewCourseService {
    private NewCourseRepository newCourseRepository;
    public List<NewCount> findAllUser(){
        return newCourseRepository.findAllUser();
    }
    public NewCount getNewCountBynameTypeTopic(String type,String name,List<String> topic) {
        NewCount count = null;
        for (NewCount t : newCourseRepository.findAllUser()) {
            if (t.getTopics() == topic ||t.getType() == type || t.getName() == name) {
                return t;
            }
        }
        return count;
    }
    public NewCount getCountById(Integer id) {
        for (NewCount t : newCourseRepository.findAllUser()) {
            if (Objects.equals(t.getId(), id)) {
                return t;
            }
        }
        throw new NotFoundException("Not found todo with id = " + id);
    }

}
