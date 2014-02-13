package com.mcnaughty.gameCore;

public abstract class Level {
	
	protected String name;

	protected Level(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
