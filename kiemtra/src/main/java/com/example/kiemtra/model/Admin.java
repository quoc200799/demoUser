package com.example.kiemtra.model;

import com.example.kiemtra.model.NewCount;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Admin {
    private Integer currentPage; //trang hiện tại
    private Integer pageSize; // số item trên trang hiện tại
    private Integer totalPages; //Tổng số trang
    private Integer totalItems;//Tổng số item
    private List<NewCount> newCounts;
}
