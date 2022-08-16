package com.VikasAPI.VikasAPI.services;

import com.VikasAPI.VikasAPI.entities.Details;

public interface serviceinterface {
	public Details addSHGDetails(Details details);
	
	public Details getDetails(int SHGId);
	
	public Details findById(int SHGId);
	
	void DeleteSHGData(int SHGId);

//	Details getDetails(Integer SHGId);

}
