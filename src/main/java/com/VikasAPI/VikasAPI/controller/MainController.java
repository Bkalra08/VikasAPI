package com.VikasAPI.VikasAPI.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VikasAPI.VikasAPI.DAO.DAOlayer;
import com.VikasAPI.VikasAPI.entities.Details;
import com.VikasAPI.VikasAPI.services.serviceClass;

class photo64res{
	private String photo64 = "whfwdhvb";

	public String getPhoto64() {
		return photo64;
	}

	public void setPhoto64(String photo64) {
		this.photo64 = photo64;
	}
}

@RestController
@RequestMapping("/SHGData")



public class MainController  {
	
	
	@Autowired
	private serviceClass Service;
	@Autowired
	private DAOlayer dlayer;
	
//	@Autowired
//	private Details details;
	
	
	
	@PostMapping("/AddData")
	public Details addSHGDetails(@RequestBody Details details) {
		return this.Service.addSHGDetails(details);
				
	}
	

	@GetMapping("/GetData/{SHGId}")
	public Details getDetails(@PathVariable String SHGId ) {
		return this.Service.getDetails(Integer.parseInt(SHGId));
		
	}

	@DeleteMapping("/DLTDATA/{SHGId}")
	public ResponseEntity<?>DeleteData(@PathVariable int SHGId){
		Service.DeleteSHGData(Service.findById(SHGId).getSHGId() );
		 return new ResponseEntity("Data deleted successfully", HttpStatus.OK);
	}
	

	@PatchMapping("/Update/{SHGId}")
	  public ResponseEntity<Details> updateDetails(@Valid @RequestBody Details details ,@PathVariable("SHGId") int SHGId) {
		 Optional<Details> photoUpdate = Optional.of(dlayer.findById(SHGId));
		  if (photoUpdate.isPresent()) {
		    Details detail = photoUpdate.get();
	
		    detail.setPhoto64(details.getPhoto64());
//		    photoUpdate.setPhoto64
//		    return new ResponseEntity<>(dlayer.save(detail), HttpStatus.OK);
		    this.dlayer.save(detail);
		    
		    return ResponseEntity.ok(detail);
		  } 
		  else {
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
		 
	  }	
	
	@PutMapping("/details/")
	public Details putDetails(@RequestBody Details details) {
		return this.Service.putDetails(details);
	}
	
	
	
	
}
