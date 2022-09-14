package com.example.springbootrelationships.dto.response;

import com.example.springbootrelationships.enums.schoolEnum.TypeSchool;
import com.example.springbootrelationships.enums.schoolEnum.TypeSchoolName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolResponse {

    @Enumerated(EnumType.STRING)
    private TypeSchoolName schoolName;

    @Enumerated(EnumType.STRING)
    private TypeSchool type_of_school;

    // private List<Student> studentList;
}
