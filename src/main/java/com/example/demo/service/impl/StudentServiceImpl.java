package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		studentMapper.insert(stu);
	}

}
