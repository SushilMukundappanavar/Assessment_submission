package com.assessment.test.sectionB;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assessment.sectionB.two.ClownFish;
import com.assessment.sectionB.two.Shark;

public class QuestionTwo {

	@Test
	public void ClownFishTest() {
		Shark shark = new Shark();
		assertEquals("Sharks eat other fish", shark.behavior());
		assertEquals("Sharks are large and greySharks are large and grey", shark.sizeAndColour());
		
	}
	
	@Test
	public void SharkTest() {
		ClownFish clownFish = new ClownFish();
		assertEquals("Clownfish make jokes", clownFish.behavior());
		assertEquals("Clownfish are small and colourful (orange)", clownFish.sizeAndColour());
		
	}


}
