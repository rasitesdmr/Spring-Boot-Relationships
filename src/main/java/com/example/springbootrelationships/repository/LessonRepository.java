package com.example.springbootrelationships.repository;

import com.example.springbootrelationships.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson , Long> {

}
