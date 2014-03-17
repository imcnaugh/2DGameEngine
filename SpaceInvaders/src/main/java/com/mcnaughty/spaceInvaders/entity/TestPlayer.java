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
		if (input.isDownArrowPressed()) {
			moveDown(speed);
		}
		if (input.isUpArrowPressed()) {
			moveUp(speed);
		}
		if (input.isLeftArrowPressed()) {
			moveLeft(speed);
		}
		if (input.isRightArrowPressed()) {
			moveRight(speed);
		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}