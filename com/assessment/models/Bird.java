package com.assessment.models;

public class Bird extends Animal implements ISing{
	void fly() {
		System.out.println("I am flying");
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return "I am Singing";
		
	}
	
	
}
