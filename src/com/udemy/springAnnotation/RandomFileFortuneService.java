package com.udemy.springAnnotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFileFortuneService implements FileFortuneService {

	ArrayList<String> list = new ArrayList<>();
	
	String fileName = "C:/Users/Akki4lfc/eclipse-workspace/Spring-Demo-Annotation/src/Diet.txt";
	
	public RandomFileFortuneService() {
		
		try {
			
			//list = new ArrayList<>(Files.readAllLines(Paths.get(filePath)));
			
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			while(reader.ready()) {
				list.add(reader.readLine());
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	
	
	@Override
	public String getFileFortune() {
		// TODO Auto-generated method stub	
		

//****************Business logic without using default constructor****************
		
//		ArrayList<String> list = new ArrayList<>();
//		
//		String fileName = "C:/Users/Akki4lfc/eclipse-workspace/Spring-Demo-Annotation/src/Diet.txt";
//		
//			
//			try {
//				
//				//list = new ArrayList<>(Files.readAllLines(Paths.get(filePath)));
//				
//				BufferedReader reader = new BufferedReader(new FileReader(fileName));
//				
//				while(reader.ready()) {
//					list.add(reader.readLine());
//				}
//				
//			}catch(IOException e) {
//				
//				e.printStackTrace();
//				
//			}
		
		
		
		Random randomFileFortune = new Random();
		
		int randomFortuneNumber = randomFileFortune.nextInt(list.size());
		
		return list.get(randomFortuneNumber);
	}

}
