package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.aop.model.Circle;

@Aspect
public class LoggingAspect
{
	/*@Before("execution(public String getName())")
	public void loggingAdvice()
	{
//		System.out.println("Advice Run.");
	}
	
	@Before("allGetters()")		
	public void loggingAdvice()
	{
//		System.out.println("Advice Run.");
	}
	
	@Before("within(com.aop.model.Circle)")
	public void allCirceMethods(JoinPoint joinPoint)
	{
//		Circle circle = (Circle)joinPoint.getTarget();
//		circle.setName("Dummy");
//		System.out.println("all circle methods advice. " );
	}
	
	@Before("args(name)")
	public void stringArgsMethods1(String name)
	{
//		System.out.println("Method that takes a string args is going to be called. And circle name is " + name);
	}
	
//	@After("args(name)")
	@AfterReturning(pointcut="args(name)", returning="returnName")
	public void stringArgsMethods2(String name, String returnName)
	{
//		System.out.println("Method that takes a string args has been called. And circle name is " + name);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="exception")
	public void stringArgsMethods3(String name, Exception exception)
	{
//		System.out.println("Method that takes a string args has been called. And circle name is " + name + " which throws " + exception);
	}
	*/
	
	@Around("allGetters()")
//	@Around("@annotation(com.aop.aspect.Logging)")
	public Object loggingAdviceGetters(ProceedingJoinPoint pjp)
	{	Object returnValue = null;
		try {
			System.out.println("before getter");
			returnValue = pjp.proceed();
			System.out.println("after getter");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("in catch cluse");
		}
		return returnValue;
	}
	
	
	 
	@Pointcut("execution(public * getName())")			//* is wildcard here
	public void allGetters() {}
}
