package com.mcnaughty.spaceInvaders.entity;

import java.io.IOException;

import com.mcnaughty.game.domainObjects.Player;
import com.mcnaughty.game.input.Input;

public class TestPlayer extends Player {
	
	//TODO dont hardcode this
	private double speed = 3;

	protected TestPlayer(int height, int width, double xStartLocation,
			double yStartLocation, Input input, String imagePath)
			throws IOException {
		super(height, width, xStartLocation, yStartLocation, input, imagePath);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void onTick(long tick) {
		/*
		 * TODO I'm not sure if i like this because what if up and down are
		 * pressed at the same time, I'm sure that could be a good thing but it
		 * seems odd here.
		 * look at this later...
		 */
		
		if(input.isDownArrowPressed()){
			moveDown(speed);
		}
		if(input.isUpArrowPressed()){
			moveUp(speed);
		}
		if(input.isLeftArrowPressed()){
			moveLeft(speed);
		}
		if(input.isRightArrowPressed()){
			moveRight(speed);
		}
	}

}
