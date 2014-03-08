package com.mcnaughty.game.input.impl;

import com.mcnaughty.game.input.Input;

public class KeyboardinputImpl implements Input{
	
	private boolean upArrowPressed;
	private boolean downArrowPressed;
	private boolean leftArrowPressed;
	private boolean rightArrowPressed;
	
	public KeyboardinputImpl(){
		upArrowPressed = false;
		downArrowPressed = false;
		leftArrowPressed = false;
		rightArrowPressed = false;
	}

	public boolean isUpArrowPressed() {
		return upArrowPressed;
	}

	public boolean isDownArrowPressed() {
		return downArrowPressed;
	}

	public boolean isLeftArrowPressed() {
		return leftArrowPressed;
	}

	public boolean isRightArrowPressed() {
		return rightArrowPressed;
	}

}
