package com.java.spring.test.springboot.book;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookcontroller {

	
	/*public @ResponseBody List<book> getAll()
	{
		return Arrays.asList(new book(1,"Rd Sharma","Rd"));
	}*/
	@GetMapping("/book")
	public List<book> hello()
	{
		return Arrays.asList(new book(1,"Rd Sharma bro","Rd"));
	}
}
