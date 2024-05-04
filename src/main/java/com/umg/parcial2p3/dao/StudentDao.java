package com.umg.parcial2p3.dao;

import com.umg.parcial2p3.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository <Student, Long>{
}
