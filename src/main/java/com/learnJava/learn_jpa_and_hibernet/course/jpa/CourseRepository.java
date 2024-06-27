package com.learnJava.learn_jpa_and_hibernet.course.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insert(Course course)
    {
        entityManager.merge(course);

    }


}
