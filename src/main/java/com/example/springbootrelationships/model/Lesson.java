package com.example.springbootrelationships.model;

import com.example.springbootrelationships.enums.lessonEnum.TypeLanguage;
import com.example.springbootrelationships.enums.lessonEnum.TypeLessonName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "lesson")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lesson_id;

    @Enumerated(EnumType.STRING)
    private TypeLessonName lessonName;

    @Enumerated(EnumType.STRING)
    private TypeLanguage course_language;

    @JsonIgnore
    @ManyToMany(mappedBy = "lessonList", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Student> studentList = new ArrayList<>();


}

