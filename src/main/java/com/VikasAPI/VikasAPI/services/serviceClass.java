package com.VikasAPI.VikasAPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VikasAPI.VikasAPI.DAO.DAOlayer;
import com.VikasAPI.VikasAPI.entities.Details;




@Service
public class serviceClass implements serviceinterface {
	
	
	@Autowired
	private DAOlayer daolayer;

	@Override
	public Details addSHGDetails(Details details) {
		daolayer.save(details);
		return details;
	}

}
