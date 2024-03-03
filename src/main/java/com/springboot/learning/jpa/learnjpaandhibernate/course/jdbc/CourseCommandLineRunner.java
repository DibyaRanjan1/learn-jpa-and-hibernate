package com.springboot.learning.jpa.learnjpaandhibernate.course.jdbc;

import com.springboot.learning.jpa.learnjpaandhibernate.course.jdbc.course.Course;
import com.springboot.learning.jpa.learnjpaandhibernate.course.jpa.CourseJPARepository;
import com.springboot.learning.jpa.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJDBCRepository repository;

//    @Autowired
//    private CourseJPARepository repository;

    @Autowired
    private CourseSpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn Azure Now JPA","Dibya Ranjan"));
        repository.save(new Course(2,"Learn AWS Now JPA","Rani"));
        repository.save(new Course(3,"Learn GCP Now JPA","Manas Ranjan"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("Rani"));
    }
}
