package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.SchoolDTO;
import com.example.springbootrelationships.dto.response.SchoolResponse;
import com.example.springbootrelationships.model.School;
import com.example.springbootrelationships.enums.schoolEnum.TypeSchool;
import org.springframework.stereotype.Service;

@Service
public interface SchoolService {
    SchoolResponse addSchool (SchoolDTO schoolDTO, TypeSchool typeSchool);
    School getSchoolId  (Long schoolId);
}
