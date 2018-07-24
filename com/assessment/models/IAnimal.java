package com.assessment.models;

public interface IAnimal extends IFly, IWalk, ISwim, ISing {
	
	@Override
	public String fly();

	@Override	
	public String walk();
	
	@Override	
	public String swim();
	
	@Override	
	public String sing();
}
