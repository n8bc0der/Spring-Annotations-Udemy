package com.udemy.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alternateCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean result  = (theCoach == alternateCoach);
		
		System.out.println("Checking the equality result " + result);
		
		System.out.println("Checking the Memory location for theCoach " + theCoach);
		
		System.out.println("Checking the Memory location for alternateCoach " + alternateCoach);
		
		context.close();

	}

}
