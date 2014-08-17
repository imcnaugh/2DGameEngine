package com.mcnaughty.game.domainObjects;

import java.util.List;

public class HitBox {

	/*
	 * TODO somehow add the entity x and y cords to this, or account for it
	 * somehow.
	 * 
	 * TODO also find a way to handle collisions
	 */
	private double leftX;
	private double rightX;
	private double topY;
	private double bottomY;

	public Enum type;

	private List<HitBox> nextedBoxes;

	private Entity rootEntity;

	public HitBox(double leftX, double rightX, double topY, double bottomY,
			Entity rootEntity) {
		this.leftX = leftX;
		this.rightX = rightX;
		this.topY = topY;
		this.bottomY = bottomY;
		this.rootEntity = rootEntity;
	}

	public boolean isCollision(HitBox otherBox) {
		if (((otherBox.getLeftX() < this.getLeftX() && otherBox.getLeftX() > this
				.getRightX()) || (otherBox.getRightX() < this.getLeftX() && otherBox
				.getRightX() > this.getRightX()))
				&& ((otherBox.getTopY() < this.getBottomY() && otherBox
						.getTopY() > this.getTopY()) || (otherBox.getBottomY() < this
						.getBottomY() && otherBox.getBottomY() > this.getTopY()))) {
			return true;
		}
		return false;
	}

	public double getLeftX() {
		return leftX + rootEntity.getxLocation();
	}

	public void setLeftX(double leftX) {
		this.leftX = leftX;
	}

	public double getRightX() {
		return rightX + rootEntity.getxLocation();
	}

	public void setRightX(double rightX) {
		this.rightX = rightX;
	}

	public double getTopY() {
		return topY + rootEntity.getyLocation();
	}

	public void setTopY(double topY) {
		this.topY = topY;
	}

	public double getBottomY() {
		return bottomY + rootEntity.getyLocation();
	}

	public void setBottomY(double bottomY) {
		this.bottomY = bottomY;
	}
}