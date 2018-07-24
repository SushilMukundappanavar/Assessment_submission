package com.assessment.sectionB.one;

import com.assessment.models.IAnimal;
import com.assessment.models.IFish;

public class Fish implements IAnimal{

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "Fishes don'st Walk";
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return "Fishes don't sing";
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return "Fishes can swim";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return null;
	}

}
