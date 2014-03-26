package com.mcnaughty.game.domainObjects;

import java.util.List;

public class HitBox {

	/*
	 * TODO somehow add the entity x and y cords to this,
	 * or account for it somehow.
	 * 
	 * TODO also find a way to handle collisions
	 */
	private double leftX;
	private double rightX;
	private double topY;
	private double bottomY;
	
	private Enum type;
	
	private List<HitBox> nextedBoxes;
	
	private Entity rootEntity;
	
	public HitBox(double leftX, double rightX, double topY, double bottomY, Entity rootEntity){
		this.leftX = leftX;
		this.rightX = rightX;
		this.topY = topY;
		this.bottomY = bottomY;
		this.rootEntity = rootEntity;
	}

	public boolean isCollision(HitBox otherBox) {
		if ((otherBox.getLeftX() < this.leftX && otherBox.getLeftX() > this.rightX)
				|| (otherBox.getRightX() < this.leftX && otherBox.getRightX() > this.rightX)) {
			if ((otherBox.getTopY() < this.bottomY && otherBox.getTopY() > this.topY)
					|| (otherBox.getBottomY() < this.bottomY && otherBox.getBottomY() > this.topY)) {
				return true;
			}
		}
		return false;
	}

	public double getLeftX() {
		return leftX;
	}

	public void setLeftX(double leftX) {
		this.leftX = leftX;
	}

	public double getRightX() {
		return rightX;
	}

	public void setRightX(double rightX) {
		this.rightX = rightX;
	}

	public double getTopY() {
		return topY;
	}

	public void setTopY(double topY) {
		this.topY = topY;
	}

	public double getBottomY() {
		return bottomY;
	}

	public void setBottomY(double bottomY) {
		this.bottomY = bottomY;
	}
}