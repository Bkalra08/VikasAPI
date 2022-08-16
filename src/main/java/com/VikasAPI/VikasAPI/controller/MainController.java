package com.VikasAPI.VikasAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.VikasAPI.VikasAPI.entities.Details;
import com.VikasAPI.VikasAPI.services.serviceClass;



@RestController
@RequestMapping("/SHGData")

public class MainController  {
	
	
	@Autowired
	private serviceClass Service;
	
	
	
	@PostMapping("/AddData")
	public Details addSHGDetails(@RequestBody Details details) {
		return this.Service.addSHGDetails(details);
				
	}
	
	
	@GetMapping("/GetData/{SHGId}")
	public Details getDetails(@PathVariable String SHGId ) {
		return this.Service.getDetails(Integer.parseInt(SHGId));
	}
	
	
	@DeleteMapping("DeleteData/{SHGId}")
//	public Details DeleteDetails(@PathVariable String SHGId) {
//		return this
//	}
	public ResponseEntity<?>DeleteData(@PathVariable int SHGId){
		Service.DeleteSHGData(Service.findById(SHGId).getSHGId() );
		 return new ResponseEntity("Data deleted successfully", HttpStatus.OK);
	}
	
	
	
	
}
