package com.mcnaughty.game.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class KeyboardAndMouseInput implements KeyListener, MouseListener,
		MouseMotionListener {

	private static List<InputListener> registerdClasses = new ArrayList<InputListener>();

	public static void addKeyboardAndMouseInputListener(
			InputListener inputListener) {
		registerdClasses.add(inputListener);
	}

	public void keyPressed(KeyEvent e) {
		for (InputListener inputListener : registerdClasses) {
			inputListener.keyPressed(e.getKeyCode());
		}
	}

	public void keyReleased(KeyEvent e) {
		for (InputListener inputListener : registerdClasses) {
			inputListener.keyReleased(e.getKeyCode());
		}
	}
	
	public void mouseMoved(MouseEvent e) {
		for (InputListener inputListener : registerdClasses) {
			inputListener.mouseMoved(e.getX(), e.getY());
		}
	}
	
	public void mousePressed(MouseEvent e) {
		for (InputListener inputListener : registerdClasses) {
			inputListener.mousePressed(e.getButton());
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		for (InputListener inputListener : registerdClasses) {
			inputListener.mouseReleased(e.getButton());
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
		for (InputListener inputListener : registerdClasses) {
			inputListener.mouseMoved(e.getX(), e.getY());
		}
	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

}