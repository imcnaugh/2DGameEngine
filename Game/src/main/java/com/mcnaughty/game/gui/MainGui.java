package com.mcnaughty.game.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainGui {

	private JFrame mainFrame = new JFrame("test of game");

	@Autowired
	private DrawArea drawArea;

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
		mainFrame.setMinimumSize(new Dimension(400, 400));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
