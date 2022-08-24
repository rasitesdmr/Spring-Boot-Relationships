package com.example.springbootrelationships.model;

import com.example.springbootrelationships.dto.request.LessonDTO;
import com.example.springbootrelationships.dto.request.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Lesson")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lesson_id;

    private String lesson_name;

    private String lesson_code;

    private String course_language;

    @ManyToMany(mappedBy = "lessonList")
    private List<Student> studentList = new ArrayList<>();



}
