package com.edutech.progressive.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.edutech.progressive.entity.Student;
 
public interface StudentRepository extends JpaRepository<Student,Integer>{
 
    Student findByStudentId(int studentId);
}
