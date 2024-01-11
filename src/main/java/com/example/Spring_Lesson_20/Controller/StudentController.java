package com.example.Spring_Lesson_20.Controller;

import com.example.Spring_Lesson_20.DTO.StudentDTO;
import com.example.Spring_Lesson_20.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("") // GET /student
    public ResponseEntity<?> create(@RequestBody StudentDTO dto) {
         studentService.create(dto);
        return ResponseEntity.ok(true);
    }

    @GetMapping("")
    public ResponseEntity<?>getall(){
        return ResponseEntity.ok(studentService.getAll());
    }




//
//    @CrossOrigin(origins = "*")
//    @GetMapping("") // GET /student
//    public ResponseEntity<List<StudentDTO>> all() {
//        return ResponseEntity.ok(studentService.all());
//    }
//
//    @GetMapping("/{id}") // GET /student/1
//    public ResponseEntity<?> getById(@PathVariable("id") String id) {
//        StudentDTO dto = studentService.get(id);
//        return ResponseEntity.ok(dto);
//    }
//
////    @PostMapping("")  //  POST /student
////    public ResponseEntity<?> create(@RequestBody StudentDTO dto) {
////        studentService.create(dto);
////        return ResponseEntity.ok(true); // 200
////    }
//
//    @PutMapping("/{id}") // PUT /student/1
//    public ResponseEntity<?> update(@RequestBody StudentDTO dto,
//                                    @PathVariable("id") String id) {
//        return ResponseEntity.ok(studentService.update(id, dto));
//    }
//
//    @DeleteMapping("/{id}") // DELETE /student/1
//    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
//        return ResponseEntity.ok(studentService.delete(id));
//    }




}
