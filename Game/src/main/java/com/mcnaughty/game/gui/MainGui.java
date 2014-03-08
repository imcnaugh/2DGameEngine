package com.mcnaughty.game.gui;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.mcnaughty.game.input.Input;
import com.mcnaughty.game.input.impl.KeyboardinputImpl;

public class MainGui {
	
	private JFrame mainFrame = new JFrame("test of game");
	
	private Input input;
	
	public MainGui(){
		input = new KeyboardinputImpl();
		configureGuiComponets();
		mainFrame.addKeyListener((KeyListener) input);
		displayMainFrame();
	}

	private void displayMainFrame() {
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	private void configureGuiComponets() {
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
