package com.example.springbootrelationships.repository;

import com.example.springbootrelationships.enums.lessonEnum.TypeLessonName;
import com.example.springbootrelationships.enums.schoolEnum.TypeSchoolName;
import com.example.springbootrelationships.model.Lesson;
import com.example.springbootrelationships.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchoolRepository extends JpaRepository<School ,Long> {

    Optional<School> findBySchoolName(TypeSchoolName schoolName);
}
