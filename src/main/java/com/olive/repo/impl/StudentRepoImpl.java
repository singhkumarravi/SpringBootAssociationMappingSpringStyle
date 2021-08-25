package com.olive.repo.impl;

import org.springframework.stereotype.Component;

import com.olive.repo.StudentRepo;
@Component
public class StudentRepoImpl implements StudentRepo{

	@Override
	public void saveStd() {
		System.out.println("Repositiory.....");
		
	}

}
