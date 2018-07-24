package com.assessment.models;

public interface IInsect extends ISing, IWalk, IFly, ISwim{
	@Override
	public abstract String walk();

	@Override
	public abstract String fly() ;
	
	@Override
	public abstract String sing() ;
		
	@Override	
	public String swim();
	
}


