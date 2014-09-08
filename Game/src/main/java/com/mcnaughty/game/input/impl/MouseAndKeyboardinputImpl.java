package com.mcnaughty.game.input.impl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import org.springframework.stereotype.Component;

import com.mcnaughty.game.input.Input;

@Component
public class MouseAndKeyboardinputImpl implements Input, KeyListener, MouseListener {

	private boolean upArrowPressed;
	private boolean downArrowPressed;
	private boolean leftArrowPressed;
	private boolean rightArrowPressed;
	private boolean spaceBarPressed;

	public MouseAndKeyboardinputImpl() {
		upArrowPressed = false;
		downArrowPressed = false;
		leftArrowPressed = false;
		rightArrowPressed = false;
		spaceBarPressed = false;
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

	public boolean isSpaceBarPressed() {
		return spaceBarPressed;
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
			case (KeyEvent.VK_SPACE): {
				spaceBarPressed = true;
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
			case (KeyEvent.VK_SPACE): {
				spaceBarPressed = false;
				break;
			}
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void mouseClicked(MouseEvent arg0) {
		
	}

	public void mouseEntered(MouseEvent arg0) {
		
	}

	public void mouseExited(MouseEvent arg0) {
		
	}

	public void mousePressed(MouseEvent arg0) {
		
	}

	public void mouseReleased(MouseEvent arg0) {
		
	}
}