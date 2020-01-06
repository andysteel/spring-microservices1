package com.gmail.andersoninfonet.cloudcourse.repository;

import com.gmail.andersoninfonet.cloudcourse.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}