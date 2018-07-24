package com.assessment.sectionA.four;

import com.assessment.models.ISing;

public class FindParrotVoice {

	public String getvoice(String voice) {

		Parrot parrot =  new Parrot();

		if (voice.equalsIgnoreCase("Woof, woof")) 
			parrot.getVoice(voice);
		else if (voice.equalsIgnoreCase("Meow")) 
			parrot.getVoice(voice);
		 else if (voice.equalsIgnoreCase("Cock-a-doodle-doo")) 
			 parrot.getVoice(voice);
		else if (voice.equalsIgnoreCase("Tring Tring")) 
			parrot.getVoice(voice);
		else if(voice.equalsIgnoreCase("Quack Quack"))
			parrot.getVoice(voice);
		
		return parrot.sing();
	}
}
