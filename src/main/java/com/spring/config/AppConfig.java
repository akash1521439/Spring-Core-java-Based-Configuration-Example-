package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.controller.PizzaController;
import com.spring.lazy.LazyLoader;
import com.spring.service.MixedPizza;
import com.spring.service.NonVegPizza;
import com.spring.service.Pizza;
import com.spring.service.VegPizza;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {
	
	//Explicitly creating for mixed Pizza class
	@Bean
	public Pizza mixedPizza() {
		return new MixedPizza();
	}
	
	@Bean
	public Pizza vegPizza() {
		return new VegPizza();
	}
	
	@Bean
	public Pizza nonVegPizza() {
		return new NonVegPizza();
	}
	
	/*
	@Bean
	public PizzaController pizzaController() {
		return new PizzaController(mixedPizza());
	}
	*/
	
	//Bean init method and destroy method 
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public PizzaController pizzaController() {
		return new PizzaController(nonVegPizza());
	}
	
//	@Bean
//	public LazyLoader lagy() {
//		return new LazyLoader();
//	}
}
