package com.spring.service;

import org.springframework.stereotype.Component;

//@Component
public class VegPizza implements Pizza{
	@Override
	public String getPizza() {
		return "I am vegitable pizza";
	}
}
