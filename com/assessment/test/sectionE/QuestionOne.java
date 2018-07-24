package com.assessment.test.sectionE;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assessment.sectionE.CountAnimalsByCharacteristics;

public class QuestionOne {

	@Test
	public void animalCharactersTest() {
		CountAnimalsByCharacteristics countAnimalCharacters = new CountAnimalsByCharacteristics();
		countAnimalCharacters.getCount();
		System.out.println(countAnimalCharacters.getFlyCount() + " " + countAnimalCharacters.getWalkCount() + " "
				+ countAnimalCharacters.getSingCount() + " " + countAnimalCharacters.getSwimCount());
		
		assertEquals(new Integer(2), new Integer(countAnimalCharacters.getFlyCount()));
		assertEquals(new Integer(2), new Integer(countAnimalCharacters.getWalkCount()));
		assertEquals(new Integer(12), new Integer(countAnimalCharacters.getSingCount()));
		assertEquals(new Integer(5), new Integer(countAnimalCharacters.getSwimCount()));
	}

}
