package com.cjc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.StudentPersonalDetails;
import com.cjc.service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/multistep")
public class HomeControllers {

	@Autowired
	StudentService ss;
	
	@PostMapping("/save")
	public StudentPersonalDetails save(@RequestBody StudentPersonalDetails stp) {
		
		return ss.save(stp);
	}
}
