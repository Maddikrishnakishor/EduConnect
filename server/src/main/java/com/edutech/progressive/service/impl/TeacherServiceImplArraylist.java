package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Teacher;
import com.edutech.progressive.service.TeacherService;

@Service
public class TeacherServiceImplArraylist  implements TeacherService{
    private static List<Teacher> teacherList=new ArrayList<>();
    @Override
    public List<Teacher> getAllTeachers() {
        
       return teacherList;
    }

    @Override
    public Integer addTeacher(Teacher teacher) {
        
        teacherList.add(teacher);
       return teacherList.size();
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() {
        Collections.sort(teacherList);
        return teacherList;
    }

    public void emptyArrayList(){
    teacherList.clear();
    } 
}
