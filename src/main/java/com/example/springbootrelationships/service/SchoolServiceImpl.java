package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.SchoolDTO;
import com.example.springbootrelationships.dto.response.SchoolResponse;
import com.example.springbootrelationships.mapper.SchoolMapper;
import com.example.springbootrelationships.mapper.StudentMapper;
import com.example.springbootrelationships.model.School;
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
    public SchoolResponse addSchool(SchoolDTO schoolDTO) {
        School school = new School();
        school.setSchool_name(schoolDTO.getSchool_name());
        school.setType_of_school(schoolDTO.getType_of_school());
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
