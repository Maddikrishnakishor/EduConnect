package com.edutech.progressive.controller;

import com.edutech.progressive.entity.Teacher;

import com.edutech.progressive.service.impl.TeacherServiceImplArraylist;

import com.edutech.progressive.service.impl.TeacherServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
 
import java.util.List;
 
@RestController

@RequestMapping("/teacher")

public class TeacherController {

    @Autowired

    private TeacherServiceImplJpa teacherServiceImplJpa;
 
    @Autowired

    private TeacherServiceImplArraylist teacherServiceImplArraylist;
 
    @GetMapping()

    public ResponseEntity<List<Teacher>> getAllTeachers() throws Exception {

        return ResponseEntity.ok(teacherServiceImplJpa.getAllTeachers());

    }

    @GetMapping("/{teacherId}")

    public ResponseEntity<Teacher> getTeacherById(@PathVariable int teacherId) throws Exception {

        return ResponseEntity.ok(teacherServiceImplJpa.getTeacherById(teacherId));

    }

    @PostMapping()

    public ResponseEntity<Integer> addTeacher(@RequestBody Teacher teacher) throws Exception {

        Integer id = teacherServiceImplJpa.addTeacher(teacher);

        return ResponseEntity.status(201).body(id);

    }

    @PutMapping("/{teacherId}")

    public ResponseEntity<Void> updateTeacher(@PathVariable int teacherId,@RequestBody Teacher teacher) throws Exception {

        teacher.setTeacherId(teacherId);

        teacherServiceImplJpa.updateTeacher(teacher);

        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/{teacherId}")

    public ResponseEntity<Void> deleteTeacher(@PathVariable int teacherId) throws Exception {

        teacherServiceImplJpa.deleteTeacher(teacherId);

        return ResponseEntity.noContent().build();

    }
 
    @GetMapping("/yearsofexperience")

    public ResponseEntity<List<Teacher>> getTeacherSortedByYearsOfExperience() {

        return ResponseEntity.ok(teacherServiceImplArraylist.getTeacherSortedByExperience());

    }

}

 