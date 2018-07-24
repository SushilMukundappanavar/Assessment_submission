package com.assessment.test.sectionA;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assessment.models.IAnimal;
import com.assessment.models.IBird;
import com.assessment.sectionA.two.Animal;
import com.assessment.sectionA.two.Chicken;
import com.assessment.sectionA.two.Duck;

public class OuestionTwo {
	// Question 2 A and B
	@Test
	public void testDuck() {
		IAnimal duck = new Duck();
		assertEquals("I am Swimming", duck.swim());
		assertEquals("Quack Quack", duck.sing());
	}

	
	//Question 2 C and D
	@Test
	public void testChicken() {
		IAnimal chicken = new Chicken();
		assertEquals("I cannot Fly", chicken.fly());
		assertEquals("Cluck Cluck", chicken.sing());
	}

}
