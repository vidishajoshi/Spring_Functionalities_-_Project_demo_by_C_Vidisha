package com.example.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkouts() {
		
		return "Daily spend total of 30 minutes on batting practice";
	}

}
