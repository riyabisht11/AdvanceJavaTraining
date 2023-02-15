package com.spm.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class tyre {
	private String brand;
	public String getBrand() {
		return brand;
	}
	//public tyre(String brand) {
		//super();
		//this.brand = brand;
	//}
	@Override
	public String toString() {
		//return "tyre [brand=" + brand + "]";
		return "tyre is working in";
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
