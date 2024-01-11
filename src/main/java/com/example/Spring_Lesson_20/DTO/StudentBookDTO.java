package com.example.Spring_Lesson_20.DTO;

import com.example.Spring_Lesson_20.Enums.Status;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class StudentBookDTO {

//    StudentBook (id,student_id,book_id,createdDate,Status,returnedDate,duration)

    private String id;
    private String student_id;
    private String book_id;
    private LocalDateTime createdDate;
    private LocalDateTime returnedDate;
    private  String duration;
    private Status status;


}
