package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.student.Student;
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;

@SpringBootApplication
// @RestController
public class DemoApplication {

	public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args);}

//	@GetMapping
//	public String hello() {
//		return "Hello World";
//	}

//	@GetMapping
//	public List<Student> hello() {
//		return List.of(
//				new Student(
//						1L,
//						"Mariam",
//						"mariam@gmail.com",
//						21,
//						LocalDate.of(2000, Month.JANUARY, 5))
//		);
//	}
}
