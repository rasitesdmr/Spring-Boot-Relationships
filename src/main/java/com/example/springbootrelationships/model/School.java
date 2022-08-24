package com.example.springbootrelationships.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mapstruct.EnumMapping;

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

    private String school_name;

    @Enumerated(EnumType.ORDINAL)
    private TypeSchool type_of_school;

    @OneToMany(mappedBy = "school")
    private List<Student>studentList;


}
