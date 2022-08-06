package com.VikasAPI.VikasAPI.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "UserData")


public class Details {
	
	private String SHGId;
	private String name;
	private String age;
	private String gender ;
	private String SHGName;
	private String aadharnumber;
	private String category;
	private String monthlyincome;
	private String bankaccountnumber;
	
	
	public Details(String sHGId, String name, String age, String gender, String sHGName, String aadharnumber,
			String category, String monthlyincome, String bankaccountnumber) {
		super();
		this.SHGId = sHGId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.SHGName = sHGName;
		this.aadharnumber = aadharnumber;
		this.category = category;
		this.monthlyincome = monthlyincome;
		this.bankaccountnumber = bankaccountnumber;
	}
	public String getSHGId() {
		return SHGId;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Details [SHGId=" + SHGId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", SHGName="
				+ SHGName + ", aadharnumber=" + aadharnumber + ", category=" + category + ", monthlyincome="
				+ monthlyincome + ", bankaccountnumber=" + bankaccountnumber + ", getSHGId()=" + getSHGId()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender()
				+ ", getSHGName()=" + getSHGName() + ", getAadharnumber()=" + getAadharnumber() + ", getCategory()="
				+ getCategory() + ", getMonthlyincome()=" + getMonthlyincome() + ", getBankaccountnumber()="
				+ getBankaccountnumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public void setSHGId(String sHGId) {
		SHGId = sHGId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSHGName() {
		return SHGName;
	}
	public void setSHGName(String sHGName) {
		SHGName = sHGName;
	}
	public String getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(String aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMonthlyincome() {
		return monthlyincome;
	}
	public void setMonthlyincome(String monthlyincome) {
		this.monthlyincome = monthlyincome;
	}
	public String getBankaccountnumber() {
		return bankaccountnumber;
	}
	public void setBankaccountnumber(String bankaccountnumber) {
		this.bankaccountnumber = bankaccountnumber;
	}
}
