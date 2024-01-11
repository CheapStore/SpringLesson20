package com.example.Spring_Lesson_20.Repository;

import com.example.Spring_Lesson_20.Entity.StudentBookEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentBookRepository extends CrudRepository<StudentBookEntity,String> {



}
