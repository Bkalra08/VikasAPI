 package com.VikasAPI.VikasAPI.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "UserData")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Details {
	
	
	@Id
	private Integer SHGId;
	
	
	private String name;
	private String age;
	private String gender ;
	private String SHGName;
	private String aadharnumber;
	private String category;
	private String monthlyincome;
	private String bankaccountnumber;
	

}
