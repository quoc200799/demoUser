package com.example.kiemtra.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpsertCourseRequest {
    private String name;
    private String decription;
    private String type;
    private List<String> topics;
    private String thumbnail;
    private Integer userId;
}
