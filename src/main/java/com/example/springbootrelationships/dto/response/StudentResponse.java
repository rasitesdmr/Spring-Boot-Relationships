package com.example.springbootrelationships.dto.response;

import com.example.springbootrelationships.model.Lesson;
import com.example.springbootrelationships.model.School;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private Long student_id;

    private String first_name;

    private String last_name;

    private int studentNumber;

    private School school;

    private List<Lesson> lessonList;
}
