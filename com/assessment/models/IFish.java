package com.assessment.models;

public interface IFish extends ISing, IWalk, ISwim, IFly{
	
	@Override
	public abstract String walk();
	

	@Override
	public abstract String sing() ;
	
	@Override
	public abstract String swim() ;
	
	@Override
	public String fly();
	
	
}
