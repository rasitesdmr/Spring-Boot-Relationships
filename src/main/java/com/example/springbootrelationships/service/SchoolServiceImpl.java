package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.SchoolDTO;
import com.example.springbootrelationships.dto.response.SchoolResponse;
import com.example.springbootrelationships.mapper.SchoolMapper;
import com.example.springbootrelationships.model.School;
import com.example.springbootrelationships.enums.schoolEnum.TypeSchool;
import com.example.springbootrelationships.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    SchoolRepository schoolRepository;
    @Autowired
    SchoolMapper schoolMapper;

    @Override
    public SchoolResponse addSchool(SchoolDTO schoolDTO, TypeSchool typeSchool) {
        School school = schoolMapper.schoolDTOToSchool(schoolDTO);
        school.setType_of_school(typeSchool);
        schoolRepository.save(school);
        return schoolMapper.schoolToSchoolResponse(school);
    }

    @Override
    public School getSchoolId(Long schoolId) {
        return schoolRepository.findById(schoolId).orElseThrow(() ->
                new IllegalArgumentException(
                         schoolId + " could not be found"));
    }
}
