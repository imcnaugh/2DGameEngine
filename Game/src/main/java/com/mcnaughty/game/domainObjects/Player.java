package com.mcnaughty.game.domainObjects;

import java.awt.event.KeyEvent;
import java.io.IOException;

import com.mcnaughty.game.input.InputListener;
import com.mcnaughty.game.input.KeyboardAndMouseInput;

public abstract class Player extends Entity implements InputListener {

	protected boolean upArrowPressed = false;
	protected boolean downArrowPressed = false;
	protected boolean leftArrowPressed = false;
	protected boolean rightArrowPressed = false;
	protected boolean spaceKeyPressed = false;

	protected Player(int height, int width, double xStartLocation,
			double yStartLocation, String imagePath) throws IOException {
		super(height, width, xStartLocation, yStartLocation, imagePath);
		KeyboardAndMouseInput.addKeyboardAndMouseInputListener(this);
	}

	public void keyPressed(int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_UP: {
				upArrowPressed = true;
				break;
			}
			case KeyEvent.VK_DOWN: {
				downArrowPressed = true;
				break;
			}
			case KeyEvent.VK_LEFT: {
				leftArrowPressed = true;
				break;
			}
			case KeyEvent.VK_RIGHT: {
				rightArrowPressed = true;
				break;
			}
			case KeyEvent.VK_SPACE: {
				spaceKeyPressed = true;
				break;
			}
		}
	}

	public void keyReleased(int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_UP: {
				upArrowPressed = false;
				break;
			}
			case KeyEvent.VK_DOWN: {
				downArrowPressed = false;
				break;
			}
			case KeyEvent.VK_LEFT: {
				leftArrowPressed = false;
				break;
			}
			case KeyEvent.VK_RIGHT: {
				rightArrowPressed = false;
				break;
			}
			case KeyEvent.VK_SPACE: {
				spaceKeyPressed = false;
				break;
			}
		}
	}

	public void mousePressed(int mouseButtonCode, int xCord, int yCord) {

	}

	public void mouseReleased(int mouseButtonCode, int xCord, int yCord) {

	}
}