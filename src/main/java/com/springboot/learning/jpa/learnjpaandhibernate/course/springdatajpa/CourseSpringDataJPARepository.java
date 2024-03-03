package com.springboot.learning.jpa.learnjpaandhibernate.course.springdatajpa;

import com.springboot.learning.jpa.learnjpaandhibernate.course.jdbc.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJPARepository extends JpaRepository<Course,Long> {

    List<Course> findByAuthor(String author);
}
