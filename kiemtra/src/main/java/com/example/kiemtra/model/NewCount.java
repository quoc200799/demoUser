package com.example.kiemtra.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class NewCount {
    private Integer id;
    private String name;
    private String decription;
    private String type;
    private List<String> topics;
    private String thumbnail;
    private User user;
}
