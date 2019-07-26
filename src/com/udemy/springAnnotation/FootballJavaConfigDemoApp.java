package com.udemy.springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FootballJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		reading java config class
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(DietConfig.class);
		
//		retrieving the bean
//		Coach theCoach = context.getBean("TennisPracticeCoach",Coach.class);
		
//		using default bean-id which is the class name
		FootballCoach theCoach = context.getBean("footballCoach",FootballCoach.class);
		
//		Coach joggingCoach = context.getBean("Jogger",Coach.class);
		
//		calling the methods for the application functionality
		System.out.println(theCoach.getDailyWorkout());
		
//		System.out.println(joggingCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
//		System.out.println(theCoach.getFileFortune());
		
		
//************Using getter method to print form properties file************//
		
		System.out.println("Using getter to print Name is : " + theCoach.getName());
		
		System.out.println("Using getter to print Email is : " + theCoach.getEmail());
		
		
//		Closing the container
		context.close();

	}

}
