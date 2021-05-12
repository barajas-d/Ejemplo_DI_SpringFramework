package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Data;
import com.example.demo.model.DataRepository;

@RestController
@CrossOrigin(origins = "*")
public class ExampleService {

	private DataRepository data = new Data();
	
	@GetMapping("/example")
	public String getExample() {
		return data.showInfo();
	}
}
