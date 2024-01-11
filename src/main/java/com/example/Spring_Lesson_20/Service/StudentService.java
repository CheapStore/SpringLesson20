package com.example.Spring_Lesson_20.Service;

import com.example.Spring_Lesson_20.DTO.StudentDTO;
import com.example.Spring_Lesson_20.Entity.StudentEntity;
import com.example.Spring_Lesson_20.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;



    public StudentDTO create(StudentDTO dto) {
        StudentEntity entity = new StudentEntity();
        entity.setName(dto.getName());
        entity.setSurname(dto.getSurname());
        entity.setAge(dto.getAge());
        entity.setPhone(dto.getPhone());
        entity.setCreatedDate(LocalDateTime.now());
        studentRepository.save(entity);

        dto.setId(entity.getId());
        dto.setCreatedDate(entity.getCreatedDate());
        return dto;
    }

//    public StudentDTO create(StudentDTO dto) {
//        StudentEntity entity = new StudentEntity();
//        entity.setName(dto.getName());
//        entity.setSurname(dto.getSurname());
//        entity.setAge(dto.getAge());
//        entity.setPhone(dto.getPhone());
//        entity.setCreatedDate(LocalDateTime.now());
//        studentRepository.save(entity);
//
//        dto.setId(entity.getId());
//        dto.setCreatedDate(LocalDateTime.now());
//        return dto;
//    }



    public List<StudentDTO> getAll() {
        Iterable<StudentEntity> entityList = studentRepository.findAll();
        List<StudentDTO> dtoList = new LinkedList<>();
        for (StudentEntity entity : entityList) {
            StudentDTO dto = new StudentDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setSurname(entity.getSurname());
            dto.setAge(entity.getAge());
            dto.setPhone(entity.getPhone());
            dto.setCreatedDate(entity.getCreatedDate());
            dtoList.add(dto);
        }
        return dtoList;
    }



}
