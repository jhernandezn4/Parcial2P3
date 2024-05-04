package com.umg.parcial2p3.controllers;


import com.umg.parcial2p3.entities.Subject;
import com.umg.parcial2p3.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping
    public List<Subject> GetAll(){
        return subjectService.getAll();
    }

    @GetMapping(value="/{id}")
    public Subject GetById(@PathVariable Long id){
        return subjectService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody Subject subject){
        subjectService.create(subject);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Subject subject){
        subjectService.update(id, subject);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        subjectService.delete(id);
    }
}
