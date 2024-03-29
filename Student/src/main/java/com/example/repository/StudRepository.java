package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface StudRepository extends CrudRepository<Student, Integer>{

}
