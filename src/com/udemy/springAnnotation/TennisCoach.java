package com.udemy.springAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("TennisPracticeCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

//******************Using Field Injection for Autowiring******************//
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Autowired
	private FileFortuneService fileFortuneService;
	
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


	@Override
	public String getFileFortune() {
		// TODO Auto-generated method stub
		return fileFortuneService.getFileFortune();
	}
	
	@PostConstruct
	public void preWorkOutDiet() {
		
		System.out.println("Make sure you are hydrated for intense training and have adequate"
							+ "fluid with you and keep bananas with you.");
		
	}
	
	@PreDestroy
	public void postPracticeDiet() {
		
		System.out.println("Take rest and drink fluids for energy.");
		
	}

}
