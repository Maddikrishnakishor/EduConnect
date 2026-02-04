package com.edutech.progressive.service.impl;
 
import java.util.ArrayList;

import java.util.List;
 
import org.springframework.stereotype.Service;
 
import com.edutech.progressive.entity.Course;

import com.edutech.progressive.repository.CourseRepository;

@Service

public class CourseServiceImplJpa  {

    private CourseRepository courseRepository;
 
    public List<Course> getAllCourses() throws Exception{

        return new ArrayList<>();

    }
 
    public Course getCourseById(int courseId) throws Exception{

        return null;

    }
 
    public Integer addCourse(Course course)throws Exception{

        return -1;

    }
 
    public void updateCourse(Course course) throws Exception{
 
    }
 
    public void deleteCourse(int courseId) throws Exception{
 
    }
 
    public List<Course> getAllCoursesByTeacherId(int teacherId){

        return null;

    }
 
}
 