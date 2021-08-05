package com.example.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating the object
		Coach theCoach=new TrackCoach();
		
		Coach theCoach2= new BaseballCoach();
		
		//using the object
		System.out.println("Message for the coach: "+theCoach.getDailyWorkouts());
		System.out.println("Message from the baseball coach for a good stat: "+theCoach2.getDailyWorkouts());
	}

}
