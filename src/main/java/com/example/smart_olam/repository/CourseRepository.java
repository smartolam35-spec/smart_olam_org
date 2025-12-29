package com.example.smart_olam.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smart_olam.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
