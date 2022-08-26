 package com.VikasAPI.VikasAPI.entities;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "UserData")
//@Document(collection = "UserDatatesting")
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
	private String SHGName;
	private String aadharnumber;
	private String monthlyincome;
	private String bankname;
	private String bankaccountnumber;
	private Integer Transaction;
	private String photo64;
	private Date date;
//	private Time time;

}
