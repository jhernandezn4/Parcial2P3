package com.umg.parcial2p3.services;


import com.umg.parcial2p3.dao.SubjectDao;
import com.umg.parcial2p3.entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SubjectServiceImp implements SubjectService{
    @Autowired
    SubjectDao subjectDao;

    @Override
    public List<Subject> getAll() {
        return (List<Subject>)subjectDao.findAll();
    }

    @Override
    public Subject getById(Long id) {
        return subjectDao.findById(id).orElse(null);
    }

    @Override
    public void create(Subject subject) {
        subjectDao.save(subject);
    }

    @Override
    public void update(Long id, Subject subject) {
        if (subjectDao.existsById(id)){
            subject.setId(id);
            subjectDao.save(subject);
        }
    }

    @Override
    public void delete(Long id) {
        if (subjectDao.existsById(id)){
            subjectDao.deleteById(id);
        }
    }
}
