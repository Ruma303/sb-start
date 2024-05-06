package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

//    @GetMapping
//    public List<Student> getStudents() {
//        return List.of(
//                new Student(
//                        1L,
//                        "Mariam",
//                        "mariam@gmail.com",
//                        21,
//                        LocalDate.of(2000, Month.JANUARY, 5))
//        );
//    }
}
