package com.spm.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.println("hello world");
	}

}
