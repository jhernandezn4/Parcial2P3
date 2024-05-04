package com.umg.parcial2p3.services;

import com.umg.parcial2p3.entities.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAll();
    public Student getById(Long id);
    public void create(Student student);
    public void update(Long id, Student student);
    public void delete(Long id);
}
