package com.mcnaughty.game.domainObjects;

import java.io.IOException;

public abstract class EntityWithHitBox extends Entity {

	protected HitBox hitBox;

	protected EntityWithHitBox(int height, int width, double xStartLocation,
			double yStartLocation, String imagePath) throws IOException {
		super(height, width, xStartLocation, yStartLocation, imagePath);
		registerHitBoxes();
	}
	
	protected abstract void registerHitBoxes();
}
