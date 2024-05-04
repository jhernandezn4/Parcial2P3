package com.umg.parcial2p3.controllers;

import com.umg.parcial2p3.entities.Student;
import com.umg.parcial2p3.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/students")


public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> GetAll(){
        return studentService.findAll();
    }

    @GetMapping(value="/{id}")
    public Student GetById(@PathVariable Long id){
        return studentService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody Student student){
        studentService.create(student);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Student student){
        studentService.update(id, student);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        studentService.delete(id);
    }
}
