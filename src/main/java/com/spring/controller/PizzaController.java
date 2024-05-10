package com.spring.controller;

 
 
 

import com.spring.service.Pizza;

//@Component
public class PizzaController {
	

	Pizza pizza;

//	@Autowired
	public PizzaController(Pizza pizza) {
		this.pizza = pizza;
	}
	

	
	public String getPizza(){
		return pizza.getPizza();
	}
	
	public void init() {
		System.out.println("Initialization logic");
	}
	
	public void destroy() {
		System.out.println("Destroy method");
	}

}
