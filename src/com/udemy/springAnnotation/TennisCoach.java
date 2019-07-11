package com.udemy.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("TennisPracticeCoach")
@Component
public class TennisCoach implements Coach {

//******************Using Field Injection for Autowiring******************//
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//******************Using Constructor Method for Autowiring******************//
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		
//		fortuneService = theFortuneService;
//	}

	
//******************Default Constructor******************//
	
	public TennisCoach() {
		System.out.println("Inside TennisCoach Default Constructor");
	}
	
	
//******************Using setter Method for Autowiring******************//
	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		
//		fortuneService = theFortuneService;
//	}

//******************Using setter Method for Autowiring******************//
	
//	@Autowired
//	public void fortuneMethod(FortuneService theFortuneService) {
//			
//		fortuneService = theFortuneService;
//	}	
	
	
//******************Implementation of Coach interface Overridden method******************//
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice taking service for Aces";
	}

//*****************Implementation of FortuneService interface Overridden method*****************//	
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
