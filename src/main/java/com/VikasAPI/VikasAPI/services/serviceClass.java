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


	@Override
	public void DeleteSHGData(int SHGId) {
		daolayer.deleteById(SHGId);
		
	}

	@Override
	public Details findById(int SHGId) {
		
		return daolayer.findById(SHGId);
	}


	@Override
	public Details getDetails(int SHGId) {
		return daolayer.findById(SHGId);
	}

	@Override
	public Details putDetails(Details detail) {
		daolayer.save(detail);
		return detail;
	}
//
//	@Override
//	public void updateDetails(int SHGId) {
//		daolayer.save(SHGId);
//			}


//	@Override
//	public Details UploadIMG(int SHGId) {
//		return daolayer.save(Details.getPhoto64());
//	}



}
