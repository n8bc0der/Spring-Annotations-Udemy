package com.udemy.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		creating spring container for application
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
//		retrieving the bean
//		Coach theCoach = context.getBean("TennisPracticeCoach",Coach.class);
		
//		using default bean-id which is the class name
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
//		Coach joggingCoach = context.getBean("Jogger",Coach.class);
		
//		calling the methods for the application functionality
		System.out.println(theCoach.getDailyWorkout());
		
//		System.out.println(joggingCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getFileFortune());
		
//		Closing the container
		context.close();

	}

}
