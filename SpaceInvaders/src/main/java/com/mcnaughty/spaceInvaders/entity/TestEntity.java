package com.mcnaughty.spaceInvaders.entity;

import java.io.IOException;

import com.mcnaughty.game.domainObjects.Entity;

public class TestEntity extends Entity {

	public TestEntity(int height, int width, double xStartLocation,
			double yStartLocation, String imagePath) throws IOException {
		super(height, width, xStartLocation, yStartLocation, imagePath);
	}

	public void onTick(long tick) {

	}

}
