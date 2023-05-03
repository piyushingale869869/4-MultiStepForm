package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Model.Address;
import com.cjc.main.repositoryi.ARepositoryi;
import com.cjc.main.servicei.AServicei;

@Service
public class AServiceImpl implements AServicei
{
	@Autowired
	ARepositoryi ari;

	@Override
	public Address save(Address address) {
		return ari.save(address);
	}
	
	

}
