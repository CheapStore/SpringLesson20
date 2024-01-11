package com.example.Spring_Lesson_20.Controller;

import com.example.Spring_Lesson_20.DTO.BookDTO;
import com.example.Spring_Lesson_20.DTO.StudentDTO;
import com.example.Spring_Lesson_20.Entity.BookEntity;
import com.example.Spring_Lesson_20.Entity.StudentBookEntity;
import com.example.Spring_Lesson_20.Entity.StudentEntity;
import com.example.Spring_Lesson_20.Repository.StudentBookRepository;
import com.example.Spring_Lesson_20.Service.StudentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student_book")
public class StudentBookController {
    @Autowired
    StudentBookService studentBookService;



    @PostMapping("") // GET /student
    public ResponseEntity<?> create(@RequestBody BookEntity bookDTO, @RequestBody StudentEntity studentDTO) {
        studentBookService.create(bookDTO,studentDTO);
        return ResponseEntity.ok(true);
    }


}
