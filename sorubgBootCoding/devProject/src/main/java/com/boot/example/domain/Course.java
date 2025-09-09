package com.boot.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    private int no;
    private String courseNumber;
    private String courseName;
    private int courseCredit;
    private String courseSection;
}