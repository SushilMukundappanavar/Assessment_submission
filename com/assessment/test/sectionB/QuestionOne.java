package com.assessment.test.sectionB;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assessment.models.IAnimal;
import com.assessment.models.IFish;
import com.assessment.sectionB.one.Fish;

public class QuestionOne {

	@Test
	public void FishTest() {
		IAnimal fish = new Fish();
		assertEquals("Fishes don'st Walk", fish.walk());
		assertEquals("Fishes don't sing", fish.sing());
		assertEquals("Fishes can swim", fish.swim());
		
	}

}
