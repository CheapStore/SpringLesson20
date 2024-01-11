package com.example.Spring_Lesson_20.Repository;

import com.example.Spring_Lesson_20.Entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends CrudRepository<StudentEntity,Integer> {

}
