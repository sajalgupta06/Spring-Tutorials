package com.learnJava.learn_jpa_and_hibernet.course;

import com.learnJava.learn_jpa_and_hibernet.course.SpringDataJpa.SpringDataJpaRepository;
import com.learnJava.learn_jpa_and_hibernet.course.jpa.Course;
import com.learnJava.learn_jpa_and_hibernet.course.jpa.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class courseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//private CourseRepository repository;


    @Autowired
    private SpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(2,"Learn React","Saloni Gupta"));
    }
}
