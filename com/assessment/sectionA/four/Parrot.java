package com.assessment.sectionA.four;

import com.assessment.models.IAnimal;
import com.assessment.models.ISing;

public class Parrot implements IAnimal {

	String voice = "";
	
	public void getVoice(String voice) {
		this.voice = voice;
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return sing(voice);
	}
	
	
	private String sing(String Voice) {
		// TODO Auto-generated method stub
		return voice;
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

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return null;
	}
}
