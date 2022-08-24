package com.example.springbootrelationships.dto.response;

import com.example.springbootrelationships.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonResponse {

    private String lesson_name;

    private String lesson_code;

    private String course_language;

    private List<Student> school;

}
