package com.example.demo.service;

import com.example.demo.pojo.Student;

public interface StudentService {

	/**
	 * 新增student到数据库
	 * @param stu
	 */
	public void saveStudent(Student stu);
}
