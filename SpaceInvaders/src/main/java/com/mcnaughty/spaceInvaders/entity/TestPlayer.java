package com.mcnaughty.spaceInvaders.entity;

import java.awt.event.MouseEvent;
import java.io.IOException;

import com.mcnaughty.game.domainObjects.Player;

public class TestPlayer extends Player {

	private double speed;

	private boolean mouseDown = false;

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
		if (rightArrowPressed) {
			moveRight(speed);
		}
		if (spaceKeyPressed) {
			System.out.println("pew");
		}
		if (mouseDown) {
			System.out.printf("x: %d y %d \n", mouseXPos, mouseYPos);
		}
	}

	public void mousePressed(int mouseButtonCode) {
		switch (mouseButtonCode) {
		case MouseEvent.BUTTON1: {
			mouseDown = true;
			System.out.printf("left button pressed at x: %d y %d \n",
					mouseXPos, mouseYPos);
			break;
		}
		}

	}

	public void mouseReleased(int mouseButtonCode) {
		switch (mouseButtonCode) {
		case MouseEvent.BUTTON1: {
			mouseDown = false;
			System.out.printf("left button released at x: %d y %d \n",
					mouseXPos, mouseYPos);
			break;
		}
		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}