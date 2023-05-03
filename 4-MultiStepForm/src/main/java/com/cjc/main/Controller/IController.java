package com.cjc.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.Model.Info;
import com.cjc.main.servicei.IServicei;

@RestController
@CrossOrigin("*")
public class IController
{
	@Autowired
	IServicei isi;
	
	@PostMapping("/info")
	public Info saveinfo(@RequestBody Info info)
	{
		return isi.save(info);
	}

}
