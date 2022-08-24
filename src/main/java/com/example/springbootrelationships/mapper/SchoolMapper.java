package com.example.springbootrelationships.mapper;

import com.example.springbootrelationships.dto.request.SchoolDTO;
import com.example.springbootrelationships.dto.response.SchoolResponse;
import com.example.springbootrelationships.model.School;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SchoolMapper {

    SchoolResponse schoolToSchoolResponse(School school);
    School schoolDTOToSchool(SchoolDTO schoolDTO);
    List<SchoolResponse> schoolToSchoolResponseList(List<School> schoolList);
}
