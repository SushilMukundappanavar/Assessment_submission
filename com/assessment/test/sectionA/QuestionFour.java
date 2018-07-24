package com.assessment.test.sectionA;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.assessment.sectionA.three.Rooster;
import com.assessment.models.ISing;
import com.assessment.sectionA.four.Cat;
import com.assessment.sectionA.four.Dog;
import com.assessment.sectionA.four.FindParrotVoice;
import com.assessment.sectionA.four.Phone;

public class QuestionFour {

	@Test
	public void parrotVoiceAsCatTest() {
		FindParrotVoice findParrotVoice = findParrotVoice = new FindParrotVoice();
		ISing testingParrotVoice = new Cat();
		assertEquals("Meow", findParrotVoice.getvoice(testingParrotVoice.sing()));

	}

	@Test
	public void parrotVoiceAsDogTest() {
		FindParrotVoice findParrotVoice = findParrotVoice = new FindParrotVoice();
		ISing testingParrotVoice = new Dog();
		assertEquals("Woof, woof", findParrotVoice.getvoice(testingParrotVoice.sing()));

	}

	@Test
	public void parrotVoiceAsPhoneTest() {
		FindParrotVoice findParrotVoice = findParrotVoice = new FindParrotVoice();
		ISing testingParrotVoice = new Phone();
		assertEquals("Tring Tring", findParrotVoice.getvoice(testingParrotVoice.sing()));

	}
	
	@Test
	public void parrotVoiceAsRoosterTest() {
		FindParrotVoice findParrotVoice = findParrotVoice = new FindParrotVoice();
		ISing testingParrotVoice = new Rooster();
		assertEquals("Cock-a-doodle-doo", findParrotVoice.getvoice(testingParrotVoice.sing()));

	}


}
