package com.example.demo.controler;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("stu")
public class StudentController {
	
	@Autowired
	private StudentService stuService;
	
	@GetMapping("create")
	public String createStudent() {
		String sid = UUID.randomUUID().toString();
		Student stu = new Student();
		stu.setId(sid);
		stu.setName("慕课网");
		stu.setSex(1);
		stu.setAge(18);
		stuService.saveStudent(stu);
		return "新增student";
	}
}
