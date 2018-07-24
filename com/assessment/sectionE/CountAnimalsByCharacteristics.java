package com.assessment.sectionE;

import com.assessment.models.Bird;
import com.assessment.models.IAnimal;
import com.assessment.sectionA.four.Cat;
import com.assessment.sectionA.four.Dog;
import com.assessment.sectionA.four.Parrot;
import com.assessment.sectionA.three.Rooster;
import com.assessment.sectionA.two.Chicken;
import com.assessment.sectionA.two.Duck;
import com.assessment.sectionB.one.Fish;
import com.assessment.sectionD.one.ButterFly;

public class CountAnimalsByCharacteristics {

	int flyCount, walkCount, singCount, swimCount;

	IAnimal[] animals = new IAnimal[] { new Duck(), new Chicken(), new Rooster(), new Parrot(), new Fish(), new Shark(),
			new Clownfish(), new Dolphin(), new Frog(), new Dog(), new ButterFly(), new Cat() };

	public void getCount() {
		this.flyCount = 0;
		this.walkCount = 0;
		this.singCount = 0;
		this.swimCount = 0;
		for (int i = 0; i < animals.length; i++) {
			if (animals[i].fly() != null)
				this.flyCount++;
			if (animals[i].walk() != null)
				this.walkCount++;
			if (animals[i].sing() != null)
				this.singCount++;
			if (animals[i].swim() != null)
				this.swimCount++;
		}
	}

	public int getFlyCount() {

		return this.flyCount;

	}

	public int getWalkCount() {

		return this.walkCount;

	}

	public int getSingCount() {

		return this.singCount;

	}

	public int getSwimCount() {

		return this.swimCount;

	}

}
