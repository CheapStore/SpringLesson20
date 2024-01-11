package com.example.Spring_Lesson_20.Service;

import com.example.Spring_Lesson_20.DTO.BookDTO;
import com.example.Spring_Lesson_20.DTO.StudentDTO;
import com.example.Spring_Lesson_20.Entity.BookEntity;
import com.example.Spring_Lesson_20.Entity.StudentBookEntity;
import com.example.Spring_Lesson_20.Entity.StudentEntity;
import com.example.Spring_Lesson_20.Enums.Status;
import com.example.Spring_Lesson_20.Repository.StudentBookRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class StudentBookService {
    @Autowired
    StudentBookRepository studentBookRepository;

    public void create(BookEntity bookDTO, StudentEntity studentDTO) {
        StudentBookEntity entity=new StudentBookEntity();
        entity.setBook(bookDTO);
        entity.setStudent(studentDTO);
        entity.setStatus(Status.OQILMAGAN);
        entity.setDuration("Yaxshi kitob");
        entity.setCreatedDate(LocalDateTime.now());
        entity.setId(UUID.randomUUID().toString());
        studentBookRepository.save(entity);

    }
}
