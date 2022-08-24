package com.example.springbootrelationships.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDTO {

    private String school_name;

    private String type_of_school;

}
