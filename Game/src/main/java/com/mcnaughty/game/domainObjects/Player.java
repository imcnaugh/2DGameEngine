package com.mcnaughty.game.domainObjects;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcnaughty.game.input.Input;

public abstract class Player extends Entity {

	@Autowired
	private Input input;

	protected Player(int height, int width, double xStartLocation,
			double yStartLocation, Input input, Image image) {
		super(height, width, xStartLocation, yStartLocation, image);
		this.input = input;
	}
}