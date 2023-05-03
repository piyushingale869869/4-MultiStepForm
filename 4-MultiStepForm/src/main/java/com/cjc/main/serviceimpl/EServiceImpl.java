package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Model.Education;
import com.cjc.main.repositoryi.ERepositoryi;
import com.cjc.main.servicei.EServicei;

@Service
public class EServiceImpl implements EServicei
{
	@Autowired
	ERepositoryi eri;

	@Override
	public Education save(Education education) {
		return eri.save(education);
	}


	

}
