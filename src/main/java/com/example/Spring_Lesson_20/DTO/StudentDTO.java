package com.example.Spring_Lesson_20.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class StudentDTO {
    private Integer id;
    private String name;
    private Integer age;
    private String surname;
    private String phone;
    private LocalDateTime createdDate;


}
