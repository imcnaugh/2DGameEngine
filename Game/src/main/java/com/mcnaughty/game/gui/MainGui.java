package com.mcnaughty.game.gui;

import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.input.KeyboardinputImpl;

@Component
public class MainGui {

	private JFrame mainFrame = new JFrame("test of game");

	@Autowired
	private DrawArea drawArea;

	@Autowired
	private KeyboardinputImpl input;

	public void setupMainGui() {
		configureGuiComponets();
		mainFrame.add(drawArea);
		displayMainFrame();
	}

	private void displayMainFrame() {
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	private void configureGuiComponets() {
		// TODO make size configurabal
		mainFrame.setPreferredSize(new Dimension(400, 400));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.addKeyListener((KeyListener) input);
	}
}
