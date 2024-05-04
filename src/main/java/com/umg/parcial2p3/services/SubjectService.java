package com.umg.parcial2p3.services;


import com.umg.parcial2p3.entities.Subject;

import java.util.List;

public interface SubjectService {
    public List<Subject> getAll();
    public Subject getById(Long id);
    public void create(Subject subject);
    public void update(Long id, Subject subject);
    public void delete(Long id);
}
