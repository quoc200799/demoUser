package com.example.kiemtra.controller;

import com.example.kiemtra.model.NewCount;
import com.example.kiemtra.service.NewCourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor

public class CourseController {
    private NewCourseService newCourseService;

    ///api/v1/courses?type={typeValue}&name={nameValue}&topic={topicValue}
    @GetMapping(value = "courses", produces = MediaType.APPLICATION_JSON_VALUE)

    public NewCount getNewCountBynameTypeTopic(
            @RequestParam(required = false) String type
            , @RequestParam(required = false) String name
            , @RequestParam(required = false) List<String> topic) {
        // (required = false) the hien gia tri day co hay khong cung duoc
        return newCourseService.getNewCountBynameTypeTopic(type, name, topic);
    }
    @GetMapping("courses/{id}")
    public ResponseEntity<?> getCountById(@PathVariable Integer id) {

        NewCount todo = newCourseService.getCountById(id);
        return ResponseEntity.ok(todo);
    }
}
