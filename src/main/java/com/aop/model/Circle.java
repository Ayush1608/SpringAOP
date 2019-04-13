package com.aop.model;

import com.aop.aspect.Logging;

public class Circle 
{
	private String name;

//	@Logging
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setter method where name is set as " + this.name);
	//	throw new RuntimeException();
	}
	
/*	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("Setter method where name is set as " + name);
		return name;
	}*/
	
}
