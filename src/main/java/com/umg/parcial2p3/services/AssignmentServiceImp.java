package com.umg.parcial2p3.services;

import com.umg.parcial2p3.dao.AssignmentDao;
import com.umg.parcial2p3.entities.Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImp implements AssignmentService{
    @Autowired
    AssignmentDao assignmentDao;


    @Override
    public List<Assignment> getAll() {
        return (List<Assignment>)assignmentDao.findAll();
    }

    @Override
    public Assignment getBySubject(Long id) {
        return assignmentDao.findById(id).orElse(null);
    }

    @Override
    public Assignment getByStudent(Long id) {
        return assignmentDao.findById(id).orElse(null);
    }

    @Override
    public void create(Assignment assignment) {
        assignmentDao.save(assignment);
    }

    @Override
    public void update(Long id, Assignment assignment) {
        if (assignmentDao.existsById(id)){
            assignment.setId(id);
            assignmentDao.save(assignment);
        }
    }

    @Override
    public void delete(Long id) {
        if (assignmentDao.existsById(id)){
            assignmentDao.deleteById(id);
        }
    }
}
