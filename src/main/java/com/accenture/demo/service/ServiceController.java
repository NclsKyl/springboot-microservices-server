package com.accenture.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	
	@RequestMapping("/getRandomText")
	public String getText() {
		 Random rand = new Random();
		    List<String> givenList = Arrays.asList("Nico", "Carl", "Hans", "Dadry","Erika");
		    String randomElement="";
		    int numberOfElements = 2;
		 
		    for (int i = 0; i < numberOfElements; i++) {
		        int randomIndex = rand.nextInt(givenList.size());
		        randomElement = givenList.get(randomIndex);
		    }
		
		return randomElement;
	}
	
	


}
