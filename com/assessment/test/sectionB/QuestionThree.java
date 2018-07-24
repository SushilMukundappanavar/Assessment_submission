package com.assessment.test.sectionB;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assessment.models.ISwim;
import com.assessment.sectionB.three.Dolphins;
import com.assessment.sectionB.two.Shark;

public class QuestionThree {

	@Test
	public void DolphinsTest() {
		ISwim dolphins = new Dolphins();
		assertEquals("Dolphins swims", dolphins.swim());
	}

}
