package com.example.Spring_Lesson_20.Entity;

import com.example.Spring_Lesson_20.DTO.StudentBookDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "book")
@Setter
@Getter
public class BookEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
        private List<StudentBookEntity> studentList;


        @Column(name = "title")
        private String title;

        @Column(name = "author")
        private String author;


        @Column(name = "date")
        private LocalDateTime date;

    }

