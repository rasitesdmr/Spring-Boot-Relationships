package com.example.springbootrelationships.mapper;

import com.example.springbootrelationships.dto.request.SchoolDTO;
import com.example.springbootrelationships.dto.response.SchoolResponse;
import com.example.springbootrelationships.model.School;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface SchoolMapper {

    SchoolResponse schoolToSchoolResponse(School school);
    @Mapping(target = "schoolName" , source = "schoolName")
    School schoolDTOToSchool(SchoolDTO schoolDTO);

}
