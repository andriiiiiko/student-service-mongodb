package com.andriiiiiko.mongodb.service.impl;

import com.andriiiiiko.mongodb.model.Student;
import com.andriiiiiko.mongodb.repository.StudentRepository;
import com.andriiiiiko.mongodb.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        boolean isExist = studentRepository.findStudentByEmail(student.getEmail()).isPresent();

        if (isExist) {
            studentRepository.save(student);
        }
    }

    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
