package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.StudentPersonalDetails;
import com.cjc.repository.StudentRepository;
import com.cjc.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository sr;

	@Override
	public StudentPersonalDetails save(StudentPersonalDetails stp) {
		
		return sr.save(stp);
	}

}
