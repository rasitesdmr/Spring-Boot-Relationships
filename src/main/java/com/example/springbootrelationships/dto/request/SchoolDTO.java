package com.example.springbootrelationships.dto.request;

import com.example.springbootrelationships.model.TypeSchool;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDTO {

    private String school_name;

    @Enumerated(EnumType.ORDINAL)
    private TypeSchool type_of_school;

}
