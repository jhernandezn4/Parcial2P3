package com.umg.parcial2p3.services;

import com.umg.parcial2p3.entities.Assignment;

import java.util.List;

public interface AssignmentService {
    public List<Assignment> findAll();
    public Assignment getById(Long id);
    public void create(Assignment assignment);
    public void update(Long id, Assignment assignment);
    public void delete(Long id);
}
