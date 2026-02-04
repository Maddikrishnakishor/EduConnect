package com.edutech.progressive.controller;

import com.edutech.progressive.entity.Student;

import com.edutech.progressive.service.impl.StudentServiceImplArraylist;

import com.edutech.progressive.service.impl.StudentServiceImplJpa;

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

@RequestMapping("/student")

public class StudentController {
 
    @Autowired

    private StudentServiceImplJpa studentServiceImplJpa;
 
    @Autowired

    private StudentServiceImplArraylist studentServiceImplArraylist;

    @GetMapping()

    public ResponseEntity<List<Student>> getAllStudents() throws Exception {

        return ResponseEntity.ok(studentServiceImplJpa.getAllStudents());

    }


    @GetMapping("/{studentId}")

    public ResponseEntity<Student> getStudentById(@PathVariable int studentId) throws Exception {

        return ResponseEntity.ok(studentServiceImplJpa.getStudentById(studentId));

    }

    @PostMapping()

    public ResponseEntity<Integer> addStudent(Student student) throws Exception {

        Integer id = studentServiceImplJpa.addStudent(student);

        return ResponseEntity.status(201).body(id);

    }

    @PutMapping("/{studentId}")

    public ResponseEntity<Void> updateStudent(@PathVariable int studentId,@RequestBody Student student) throws Exception {

        student.setStudentId(studentId);

        studentServiceImplJpa.updateStudent(student);

        return ResponseEntity.ok().build();

    }
 
    @DeleteMapping("/{studentId}")

    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) throws Exception {

        studentServiceImplJpa.deleteStudent(studentId);

        return ResponseEntity.noContent().build();

    }

    @GetMapping("/fromArrayList")

    public ResponseEntity<List<Student>> getAllStudentFromArrayList() {

        return ResponseEntity.ok(studentServiceImplArraylist.getAllStudents());

    }

    @PostMapping("/toArrayList")

    public ResponseEntity<Integer> addStudentToArrayList(Student student) {

        Integer size = studentServiceImplArraylist.addStudent(student);

        return ResponseEntity.status(201).body(size);

    }

    @GetMapping("/fromArrayList/sorted")

    public ResponseEntity<List<Student>> getAllStudentSortedByNameFromArrayList() {

        return ResponseEntity.ok(studentServiceImplArraylist.getAllStudentSortedByName());

    }

}
 
