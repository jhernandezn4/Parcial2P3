package com.umg.parcial2p3.services;

import com.umg.parcial2p3.dao.StudentDao;
import com.umg.parcial2p3.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return (List<Student>)studentDao.findAll();
    }

    @Override
    public Student getById(Long id) {
        return studentDao.findById(id).orElse(null);
    }

    @Override
    public void create( Student student) {
        studentDao.save(student);
    }

    @Override
    public void update(Long id, Student student) {
        if (studentDao.existsById(id)){
            student.setId(id);
            studentDao.save(student);
        }
    }

    @Override
    public void delete(Long id) {
        if (studentDao.existsById(id)){
            studentDao.deleteById(id);
        }
    }
}
