package com.edutech.progressive.repository;

import com.edutech.progressive.entity.Course;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{
    List<Course> findAllByTeacherId(int teacherId);
    Course findByCourseId(int courseId);
}
