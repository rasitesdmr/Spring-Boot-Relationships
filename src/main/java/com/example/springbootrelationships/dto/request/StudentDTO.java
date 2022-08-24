package com.example.springbootrelationships.dto.request;

import com.example.springbootrelationships.model.Lesson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private String first_name;

    private String last_name;

    private int student_number;

    private Long school_id;

    private List<Long> lessonIdList;



}
