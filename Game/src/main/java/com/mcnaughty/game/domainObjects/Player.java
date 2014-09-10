package com.mcnaughty.game.domainObjects;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcnaughty.game.input.Input;

public abstract class Player extends Entity {

	@Autowired
	protected Input input;

	protected Player(int height, int width, double xStartLocation,
			double yStartLocation, String imagePath) throws IOException {
		super(height, width, xStartLocation, yStartLocation, imagePath);
	}
}