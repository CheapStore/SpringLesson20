package com.example.Spring_Lesson_20.Repository;

import com.example.Spring_Lesson_20.Entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity,String> {
}
