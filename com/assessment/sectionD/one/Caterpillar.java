package com.assessment.sectionD.one;

import com.assessment.models.IAnimal;
import com.assessment.models.IInsect;

public class Caterpillar implements IAnimal{



	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "A caterpillar can walk (crawl)";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "A caterpillar cannot fly";
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return null;
	}

}
