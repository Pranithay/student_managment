package com.nishanth.student_managment;

import com.nishanth.student_managment.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class StudentManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentApplication.class, args);
	}



}
