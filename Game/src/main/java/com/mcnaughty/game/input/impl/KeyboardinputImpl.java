package com.mcnaughty.game.input.impl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.springframework.stereotype.Component;

import com.mcnaughty.game.input.Input;

@Component
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
				break;
			}
			case (KeyEvent.VK_DOWN): {
				downArrowPressed = true;
				break;
			}
			case (KeyEvent.VK_LEFT): {
				leftArrowPressed = true;
				break;
			}
			case (KeyEvent.VK_RIGHT): {
				rightArrowPressed = true;
				break;
			}
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case (KeyEvent.VK_UP): {
				upArrowPressed = false;
				break;
			}
			case (KeyEvent.VK_DOWN): {
				downArrowPressed = false;
				break;
			}
			case (KeyEvent.VK_LEFT): {
				leftArrowPressed = false;
				break;
			}
			case (KeyEvent.VK_RIGHT): {
				rightArrowPressed = false;
				break;
			}
		}
	}

	public void keyTyped(KeyEvent e) {
	}
}
