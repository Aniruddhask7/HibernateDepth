package com.example.hibernateDepth.services;

import com.example.hibernateDepth.entity.Student;
import com.example.hibernateDepth.repositery.StudentRepositery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    public final StudentRepositery studRepo;

    public StudentServices(StudentRepositery studRepo){
        this.studRepo = studRepo;
    }


    @Transactional
    public void createStudent(Student student){
        studRepo.save(student);
    }

    public Student studentGetById(int id){
        Student student = studRepo.findById(id);

        if (student == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }

        return student;
    }


    @Transactional
    public List<Student> getAllStudent() {
        return studRepo.findAll();
    }

    @Transactional
    public void deleteStudentId(Long id) {
        Student student = studRepo.findById(Math.toIntExact(id));

        if (student == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }

        studRepo.remove(student);
    }


    @Transactional
    public Student updateStudent(Student student, Long id) {
        Student existingStudent = studRepo.findById(Math.toIntExact(id));

        if (existingStudent == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }

        existingStudent.setId(student.getId());
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setAddress(student.getAddress());

        return existingStudent;
    }


}
