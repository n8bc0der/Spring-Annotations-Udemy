package com.udemy.springAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	private String[] healthyFood = {"Breakfast : Boiled Eggs/Half Fry, nuts, Milk, Peanut Butter",
									"Lunch : Chapati, Dal/Sabzi,",
									"Dinner : Chapati, Dal/Sabzi",
									"Snacks : Peanut Butter Banana Shake, Chia/Pumpkin/Flax Seeds"};
	
	private Random randomFood = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		int generateRandomIndex = randomFood.nextInt(healthyFood.length);
		
//		System.out.println(healthyFood[generateRandomIndex]);
		
		return healthyFood[generateRandomIndex];
	}

}
