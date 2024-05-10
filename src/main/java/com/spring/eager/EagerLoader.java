package com.spring.eager;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
	
	public EagerLoader() {
		System.out.println("I am eager..");
	}

}
