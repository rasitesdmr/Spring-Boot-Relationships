package com.example.springbootrelationships.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;

    private String first_name;

    private String last_name;

    private int student_number;


    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToMany()
    @JoinTable(name = "student_lesson" ,
            joinColumns = @JoinColumn(name = "student_id") ,
            inverseJoinColumns = @JoinColumn(name = "lesson_id"))
    private List<Lesson> lessonList = new ArrayList<>();


}
