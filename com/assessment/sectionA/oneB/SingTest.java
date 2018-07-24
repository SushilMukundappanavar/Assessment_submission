package com.assessment.sectionA.oneB;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assessment.models.Bird;



public class SingTest {

	@Test
	public void Singtest() {
		Bird bird = new Bird();
		assertEquals("I am Singing", bird.sing());
	}

}
