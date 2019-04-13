package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.ShapeService;

public class DrawingApp 
{
	public static void main(String args[])
	{		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");	
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
//		shapeService.getCircle().setName("Dummy Name");
//		shapeService.getCircle().setNameAndReturn("Setter Name");
		System.out.println(shapeService.getCircle().getName());
	}
}