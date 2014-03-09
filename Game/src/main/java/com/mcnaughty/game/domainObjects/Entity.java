package com.mcnaughty.game.domainObjects;

public abstract class Entity {

	private final int height;
	private final int width;

	private double xLocation;
	private double yLocation;

	/**
	 * @param height
	 *            Height of entity
	 * @param width
	 *            Width of entity
	 * @param xStartLocation
	 *            Starting X location of entity
	 * @param yStartLocation
	 *            Starting Y location of entity
	 */
	protected Entity(int height, int width, double xStartLocation,
			double yStartLocation) {
		this.height = height;
		this.width = width;
		this.xLocation = xStartLocation;
		this.yLocation = yStartLocation;
	}

	/**
	 * Moves the entity left a given number of units (probably pixels).</br> If
	 * a negative is given the entity moves right.
	 * 
	 * @param xVal
	 *            number of pixels to move left
	 * @return current x location
	 */
	protected double moveLeft(double xVal) {
		return xLocation += xVal;
	}

	/**
	 * Moves the entity right a given number of units (probably pixels).</br> If
	 * a negative is given the entity moves left.
	 * 
	 * @param xVal
	 *            number of pixels to move right
	 * @return current x location
	 */
	protected double moveRight(double xVal) {
		return xLocation -= xVal;
	}

	/**
	 * Moves the entity up a given number of units (probably pixels).</br> If a
	 * negative is given the entity moves down.
	 * 
	 * @param yVal
	 *            number of pixels to move up
	 * @return current y location
	 */
	protected double moveUp(double yVal) {
		return yLocation += yVal;
	}

	/**
	 * Moves the entity down a given number of units (probably pixels).</br> If
	 * a negative is given the entity moves up.
	 * 
	 * @param yVal
	 *            number of pixels to move down
	 * @return current y location
	 */
	protected double moveDown(double yVal) {
		return yLocation -= yVal;
	}

	/**
	 * called each tick
	 * 
	 * @param tick
	 *            current tick
	 */
	public abstract void onTick(long tick);

}
