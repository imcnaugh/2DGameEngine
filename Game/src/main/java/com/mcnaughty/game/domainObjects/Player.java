package com.mcnaughty.game.domainObjects;

import java.awt.event.KeyEvent;
import java.io.IOException;

import com.mcnaughty.game.input.InputListener;
import com.mcnaughty.game.input.KeyboardAndMouseInput;

public abstract class Player extends Entity implements InputListener {
	
	protected boolean isUpArrowPressed = false;
	

	protected Player(int height, int width, double xStartLocation,
			double yStartLocation, String imagePath) throws IOException {
		super(height, width, xStartLocation, yStartLocation, imagePath);
		KeyboardAndMouseInput.addKeyboardAndMouseInputListener(this);
	}
	
	public void keyPressed(int keyCode){
		if(keyCode == KeyEvent.VK_UP){
			isUpArrowPressed = true;
		}
	}
	
	public void keyRelesed(int keyCode){
		if(keyCode == KeyEvent.VK_UP){
			isUpArrowPressed = false;
		}
	}
}