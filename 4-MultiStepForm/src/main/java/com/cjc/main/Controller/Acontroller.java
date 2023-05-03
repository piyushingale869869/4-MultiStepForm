package com.cjc.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.Model.Address;
import com.cjc.main.servicei.AServicei;

@RestController
@CrossOrigin("*")
public class Acontroller
{
	@Autowired
	AServicei asi;
	
	@PostMapping("/address")
	public Address saveaddress(@RequestBody Address address)
	{
		return asi.save(address);
	}

}
