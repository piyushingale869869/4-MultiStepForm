package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Model.Info;
import com.cjc.main.repositoryi.IRepositoryi;
import com.cjc.main.servicei.IServicei;

@Service
public class IServiceImpl implements IServicei
{
	@Autowired
	IRepositoryi iri;

	@Override
	public Info save(Info info) {
		return iri.save(info);
	}

}
