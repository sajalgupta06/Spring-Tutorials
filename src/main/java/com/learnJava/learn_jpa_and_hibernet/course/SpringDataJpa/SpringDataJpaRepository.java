package com.learnJava.learn_jpa_and_hibernet.course.SpringDataJpa;

import com.learnJava.learn_jpa_and_hibernet.course.jpa.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaRepository extends JpaRepository<Course,Long> {
}
