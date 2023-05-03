package com.cjc.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.Model.Education;
import com.cjc.main.servicei.EServicei;

@RestController
@CrossOrigin("*")
public class EController 
{
	@Autowired
	EServicei esi;
	

	@PostMapping("/education")
	public Education saveeducation(@RequestBody Education education)
	{
		return esi.save(education);
	}

}
