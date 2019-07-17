package com.udemy.springAnnotation;

import org.springframework.stereotype.Component;

@Component("Jogger")
public class JoggingCoach implements Coach {

	public JoggingCoach() {
		
		System.out.println("Inside JoggingCoach Default Constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 3-4 times jogging in a week as per C25K and Nike app and you will see the"
				+ "difference in your stamina and your body endurance.\n You will be happy to"
				+ "see the results :)";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFileFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
