package com.example.springbootrelationships.repository;

import com.example.springbootrelationships.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School ,Long> {

}
