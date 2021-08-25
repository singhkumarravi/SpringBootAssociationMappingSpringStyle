package com.olive.controller;

import org.springframework.stereotype.Component;

import com.olive.service.StudentService;
import com.olive.service.impl.StudentImpl;

@Component
public class StudentController {
	private StudentService service;
	
	public StudentController(StudentService service) {
		this.service=service;
	}
	public void saveData() {
		service.save();
		System.out.println("Controller....");
	}

}
