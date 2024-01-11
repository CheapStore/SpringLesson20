package com.example.Spring_Lesson_20.Service;

import com.example.Spring_Lesson_20.DTO.BookDTO;
import com.example.Spring_Lesson_20.DTO.StudentDTO;
import com.example.Spring_Lesson_20.Entity.BookEntity;
import com.example.Spring_Lesson_20.Entity.StudentEntity;
import com.example.Spring_Lesson_20.Repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public BookDTO create(BookDTO bookDTO) {
        BookEntity entity = new BookEntity();
        entity.setAuthor(bookDTO.getAuthor());
        entity.setTitle(bookDTO.getTitle());
        entity.setDate(LocalDateTime.now());
        bookRepository.save(entity);

        bookDTO.setId(entity.getId().toString());
        bookDTO.setDate(entity.getDate());
        return bookDTO;
    }


    public List<BookDTO> getAll() {
        Iterable<BookEntity> entityList = bookRepository.findAll();
        List<BookDTO> dtoList = new LinkedList<>();
        for (BookEntity entity : entityList) {
            BookDTO dto = new BookDTO();
            dto.setId(entity.getId().toString());
            dto.setTitle(entity.getTitle());
            dto.setAuthor(entity.getAuthor());
            dto.setDate(entity.getDate());
            dtoList.add(dto);
        }
        return dtoList;
    }
}
