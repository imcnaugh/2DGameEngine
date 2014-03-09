package com.mcnaughty.game.gui;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcnaughty.game.input.Input;
import com.mcnaughty.game.input.impl.KeyboardinputImpl;

public class MainGui {
	
	private JFrame mainFrame = new JFrame("test of game");
	
	@Autowired
	private Input input;
	
	public MainGui(){
		configureGuiComponets();
		addListeners();
		displayMainFrame();
	}

	private void addListeners() {
		input = new KeyboardinputImpl();
		mainFrame.addKeyListener((KeyListener) input);
	}

	private void displayMainFrame() {
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	private void configureGuiComponets() {
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
