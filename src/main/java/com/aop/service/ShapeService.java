package com.aop.service;

import com.aop.aspect.Logging;
import com.aop.model.Circle;
import com.aop.model.Triangle;

public class ShapeService 
{
	private Circle circle;
	private Triangle triangle;
	
//	@Logging
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
}
