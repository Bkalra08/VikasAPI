package com.VikasAPI.VikasAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "VikasAPI",version = "1.0" , description= "API for Vikas"))


public class VikasApiApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(VikasApiApplication.class, args);
	}

}
