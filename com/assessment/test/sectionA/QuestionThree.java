package com.assessment.test.sectionA;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assessment.sectionA.three.Rooster;
import com.assessment.models.IAnimal;
import com.assessment.models.IBird;

public class QuestionThree {

	@Test
	public void roosterTest() {
		IAnimal rooster = new Rooster();
		assertEquals("Cock-a-doodle-doo", rooster.sing());
	}

}
