package com.assessment.models;

public interface IBird extends ISing, IFly, ISwim, IWalk{
	@Override
	public abstract String fly();
	
	@Override	
	public String walk();
	
	@Override
	public abstract String sing() ;
	
	@Override
	public abstract String swim() ;
	
	 
}
