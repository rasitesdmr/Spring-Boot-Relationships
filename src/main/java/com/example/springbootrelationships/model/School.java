package com.example.springbootrelationships.model;

import com.example.springbootrelationships.enums.schoolEnum.TypeSchool;
import com.example.springbootrelationships.enums.schoolEnum.TypeSchoolName;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table ( name = "School")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long school_id;

    @Enumerated(EnumType.STRING)
    private TypeSchoolName schoolName;

    @Enumerated(EnumType.STRING)
    private TypeSchool type_of_school;

    @JsonManagedReference
    @OneToMany(mappedBy = "school")
    private List<Student>studentList;


}
