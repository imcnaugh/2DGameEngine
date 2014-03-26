package com.mcnaughty.game.domainObjects;

public class HitBox {

	private double leftX;
	private double rightX;
	private double topY;
	private double bottomY;

	public boolean isCollision(HitBox otherBox) {
		if ((otherBox.getLeftX() > this.leftX && otherBox.getLeftX() < this.rightX)
				|| (otherBox.getRightX() > this.leftX && otherBox.getRightX() < this.rightX)) {
			if((otherBox.getTopY() > this.bottomY && otherBox.getTopY() < this.topY)
				|| (otherBox.getBottomY() > this.bottomY && otherBox.getBottomY() < this.topY)){
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