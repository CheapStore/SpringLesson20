package com.example.Spring_Lesson_20.Entity;

import com.example.Spring_Lesson_20.DTO.StudentBookDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "studentbek")
@Setter
@Getter
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<StudentBookEntity> courseList;

    @Column(name = "surname")
    private String surname;
    @Column(name = "phone")
    private String phone;
    @Column(name = "age")
    private Integer age;
    @Column(name = "created_date")
    private LocalDateTime createdDate;

}
