package com.mcnaughty.game.input.impl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.mcnaughty.game.input.Input;

public class KeyboardinputImpl implements Input, KeyListener {

	private boolean upArrowPressed;
	private boolean downArrowPressed;
	private boolean leftArrowPressed;
	private boolean rightArrowPressed;

	public KeyboardinputImpl() {
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
	
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case (KeyEvent.VK_UP): {
				upArrowPressed = true;
				System.out.println("up pressed");
				break;
			}
			case (KeyEvent.VK_DOWN): {
				downArrowPressed = true;
				System.out.println("down pressed");
				break;
			}
			case (KeyEvent.VK_LEFT): {
				leftArrowPressed = true;
				System.out.println("left pressed");
				break;
			}
			case (KeyEvent.VK_RIGHT): {
				rightArrowPressed = true;
				System.out.println("right pressed");
				break;
			}
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case (KeyEvent.VK_UP): {
				upArrowPressed = false;
				System.out.println("up released");
				break;
			}
			case (KeyEvent.VK_DOWN): {
				downArrowPressed = false;
				System.out.println("down released");
				break;
			}
			case (KeyEvent.VK_LEFT): {
				leftArrowPressed = false;
				System.out.println("left released");
				break;
			}
			case (KeyEvent.VK_RIGHT): {
				rightArrowPressed = false;
				System.out.println("right released");
				break;
			}
		}
	}

	public void keyTyped(KeyEvent e) {
	}
}
