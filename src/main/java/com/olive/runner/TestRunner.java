package com.olive.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.controller.StudentController;
import com.olive.service.StudentService;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
private StudentController servi;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App Stating....");
		servi.saveData();
	}

}
