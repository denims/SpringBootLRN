package com.deni.test.firtspage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstPage {
	
	@RequestMapping
	public String homePage(){
		return "First Page";
	}

}
