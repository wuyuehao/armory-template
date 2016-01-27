package com.tony.armory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tony.armory.service.dal.SampleEntityDAO;
import com.tony.armory.service.entity.SampleEntity;

@RestController
public class SampleRestService {

	@Autowired
	SampleEntityDAO dao;
	
	@RequestMapping("/")
	public SampleEntity hello(){
		SampleEntity entity = new SampleEntity();
		entity.setFirstName("Tony");
		entity.setLastName("Wu");
		
		return dao.getOne(dao.save(entity).getId());
		
	}
	
}
