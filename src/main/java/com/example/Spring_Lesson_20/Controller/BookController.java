package com.example.Spring_Lesson_20.Controller;

import com.example.Spring_Lesson_20.DTO.BookDTO;
import com.example.Spring_Lesson_20.DTO.StudentDTO;
import com.example.Spring_Lesson_20.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
 @Autowired
    BookService bookService;



    @PostMapping("") // GET /student
    public ResponseEntity<?> create(@RequestBody BookDTO dto) {
        bookService.create(dto);
        return ResponseEntity.ok(true);
    }

    @GetMapping("")
    public ResponseEntity<?>getall(){
        return ResponseEntity.ok(bookService.getAll());
    }




}
