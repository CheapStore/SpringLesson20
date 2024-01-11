package com.example.Spring_Lesson_20.Entity;


import com.example.Spring_Lesson_20.DTO.BookDTO;
import com.example.Spring_Lesson_20.DTO.StudentDTO;
import com.example.Spring_Lesson_20.Enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Table(name = "student_book")
@Setter
@Getter
public class StudentBookEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;

        @ManyToOne
        @JoinColumn(name = "book_id")
        private BookEntity book;

        @ManyToOne
        @JoinColumn(name = "student_id")
        private StudentEntity student;


        @Column(name = "createdDate")
        private LocalDateTime createdDate;

        @Column(name = "returnedDate")
        private LocalDateTime returnedDate;

        @Column(name = "status")
        private Status status;

        @Column(name = "duration")
        private String duration;

}
