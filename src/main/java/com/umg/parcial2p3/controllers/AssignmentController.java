package com.umg.parcial2p3.controllers;

import com.umg.parcial2p3.dao.AssignmentDao;
import com.umg.parcial2p3.entities.Assignment;
import com.umg.parcial2p3.entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignments")
public class AssignmentController {
    @Autowired
    AssignmentDao assignmentDao;

    @GetMapping
    public List<Assignment> GetAll(){
        return (List<Assignment>) assignmentDao.findAll();
    }

    @GetMapping(value="/{id}")
    public Subject GetById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public void create(@RequestBody Subject subject){

    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Subject subject){

    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){


    }
}
