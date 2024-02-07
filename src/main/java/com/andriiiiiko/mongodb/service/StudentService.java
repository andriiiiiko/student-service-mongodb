package com.andriiiiiko.mongodb.service;

import com.andriiiiiko.mongodb.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student createStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(String id);
}
