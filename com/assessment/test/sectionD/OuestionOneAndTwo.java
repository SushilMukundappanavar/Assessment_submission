package com.assessment.test.sectionD;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assessment.models.IAnimal;
import com.assessment.models.IInsect;
import com.assessment.sectionD.one.ButterFly;
import com.assessment.sectionD.one.Caterpillar;

public class OuestionOneAndTwo {

	@Test
	public void ButterFlyTest() {
		IAnimal butterfly = new ButterFly();
		assertEquals("Butterfly Can Fly", butterfly.fly());
		assertEquals("A butterfly does not make a sound", butterfly.sing());
		assertNull(butterfly.walk());
	}
	
	@Test
	public void CaterpillarTest() {
		IAnimal caterpillar = new Caterpillar();
		assertEquals("A caterpillar cannot fly", caterpillar.fly());
		assertNull(caterpillar.sing());
		assertEquals("A caterpillar can walk (crawl)",caterpillar.walk());
	}


}
