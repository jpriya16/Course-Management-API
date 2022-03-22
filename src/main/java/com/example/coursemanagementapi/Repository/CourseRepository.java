package com.example.coursemanagementapi.Repository;

import com.example.coursemanagementapi.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    Optional<Course> findByCourseNameIgnoreCase(String name);
}
