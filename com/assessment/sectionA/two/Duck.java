package com.assessment.sectionA.two;

import com.assessment.models.IAnimal;
import com.assessment.models.IBird;
import com.assessment.models.ISing;
import com.assessment.models.ISwim;


public class Duck implements IAnimal{
	

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return "I am Swimming";
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return "Quack Quack";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
