package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.controller.MyController;
import com.spring.controller.PizzaController;
import com.spring.lazy.LazyLoader;
import com.spring.service.MixedPizza;
import com.spring.service.Pizza;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//		Pizza pizza = context.getBean(MixedPizza.class);
		
		System.out.println(pizzaController.getPizza());
		//Lazy loader bean invocation
		LazyLoader lazyLoad = context.getBean(LazyLoader.class);
		MyController mycontroller = context.getBean(MyController.class);
		mycontroller.hello();
		context.close();
		
		
		 

	}

}
