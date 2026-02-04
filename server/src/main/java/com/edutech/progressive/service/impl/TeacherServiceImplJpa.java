package com.edutech.progressive.service.impl;
 
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;
 
import org.springframework.stereotype.Service;
 
import com.edutech.progressive.entity.Teacher;

import com.edutech.progressive.repository.TeacherRepository;

import com.edutech.progressive.service.TeacherService;
 
@Service

public class TeacherServiceImplJpa  implements TeacherService{
 
    private TeacherRepository teacherRepository;
 
    public TeacherServiceImplJpa(TeacherRepository teacherRepository) {

        this.teacherRepository = teacherRepository;

    }
 
    @Override

    public List<Teacher> getAllTeachers() throws Exception {

        return teacherRepository.findAll();

    }
 
    @Override

    public Integer addTeacher(Teacher teacher) throws Exception {

        Teacher savedTeacher = teacherRepository.save(teacher);

        return savedTeacher.getTeacherId();

    }
 
    @Override

    public List<Teacher> getTeacherSortedByExperience() throws Exception {

        List<Teacher> teachers = teacherRepository.findAll();

        Collections.sort(teachers);

        return teachers;

    }
 
    @Override

    public void updateTeacher(Teacher teacher) throws Exception{ 

        teacherRepository.save(teacher);

    }
 
    @Override

    public void deleteTeacher(int teacherId) throws Exception{ 

        teacherRepository.deleteById(teacherId);

    }
 
    @Override

    public Teacher getTeacherById(int teacherId) throws Exception{

         return teacherRepository.findByTeacherId(teacherId);

    }
 
}
 