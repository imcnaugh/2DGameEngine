package com.mcnaughty.spaceInvaders.entity;

import java.io.IOException;

import com.mcnaughty.game.domainObjects.Player;

public class TestPlayer extends Player {

	private double speed;

	public TestPlayer(int height, int width, double xStartLocation,
			double yStartLocation, String imagePath) throws IOException {
		super(height, width, xStartLocation, yStartLocation, imagePath);
	}

	public void onTick(long tick) {
		if (upArrowPressed) {
			moveUp(speed);
		}
		if (downArrowPressed) {
			moveDown(speed);
		}
		if (leftArrowPressed) {
			moveLeft(speed);
		}
		if(rightArrowPressed){
			moveRight(speed);
		}
		if(spaceKeyPressed){
			System.out.println("pew");
		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}