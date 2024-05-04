package com.umg.parcial2p3.services;

import com.umg.parcial2p3.entities.Assignment;

import java.util.List;

public interface AssignmentService {
    public List<Assignment> getAll();
    public Assignment getBySubject(Long id);
    public Assignment getByStudent(Long id);
    public void create(Assignment assignment);
    public void update(Long id, Assignment assignment);
    public void delete(Long id);
}
