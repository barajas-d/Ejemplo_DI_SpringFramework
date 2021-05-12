package com.example.demo.model;

import org.springframework.stereotype.Service;

@Service
public class Data implements DataRepository {

	@Override
	public String showInfo() {
		System.out.println("Funciona");
		return "HOLA MUNDO";
	}

}
