package com.mcnaughty.domainObjects;

public abstract class Entity {
	
	private final int height;
	private final int width;
	
	private double xLocation;
	private double yLocation;
	
	protected Entity(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	protected double moveLeft(double xVal){
		return xLocation += xVal;
	}
	
	protected double moveRight(double xVal){
		return xLocation -= xVal;
	}
	
	protected double moveUp(double yVal){
		return yLocation += yVal;
	}
	
	protected double moveDown(double yVal){
		return yLocation -= yVal;
	}

}
