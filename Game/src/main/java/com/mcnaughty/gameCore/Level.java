package com.mcnaughty.gameCore;

public abstract class Level {
	
	protected final String name;

	protected Level(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
