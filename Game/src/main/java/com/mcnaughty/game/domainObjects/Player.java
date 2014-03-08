package com.mcnaughty.game.domainObjects;

import com.mcnaughty.game.input.Input;

public abstract class Player extends Entity {

	// TODO auto wire this in in time
	private Input input;

	protected Player(int height, int width, double xStartLocation,
			double yStartLocation) {
		super(height, width, xStartLocation, yStartLocation);
	}
}
