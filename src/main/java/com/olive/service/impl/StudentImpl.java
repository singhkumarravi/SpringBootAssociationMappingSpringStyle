package com.olive.service.impl;

import org.springframework.stereotype.Component;

import com.olive.repo.StudentRepo;
import com.olive.service.StudentService;
@Component
public class StudentImpl implements StudentService {
private StudentRepo repo;

public StudentImpl(StudentRepo repo) {
	this.repo=repo;
}
	public void save() {
		repo.saveStd();
		System.out.println("Service.....");
	}

}
