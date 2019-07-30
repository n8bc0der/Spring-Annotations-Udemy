package com.udemy.springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BadmintonConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(BadmintonDemoJavaConfig.class);
		
//		Using getBean to get Bean ID from Config class as per Bean Name
//		(Advised to use bean name same as the class name)
		
		Coach theCoach = context.getBean("badmintonChachuCoach",Coach.class);
		
		System.out.println("Getting Daily Workout for Badminton " + theCoach.getDailyWorkout());
		
		System.out.println("Getting Daily Fortune for Badminton " + theCoach.getDailyFortune());
		
		context.close();
		
	}

}
