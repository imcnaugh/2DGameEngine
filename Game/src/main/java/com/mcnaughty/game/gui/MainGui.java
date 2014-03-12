package com.mcnaughty.game.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.domainObjects.Entity;
import com.mcnaughty.game.gameCore.EntityManager;
import com.mcnaughty.game.input.Input;

@Component
public class MainGui {

	private JFrame mainFrame = new JFrame("test of game");

	@Autowired
	private Input input;

	@Autowired
	private EntityManager entityManager;

	public MainGui() {
		configureGuiComponets();
		mainFrame.add(new JPanel() {
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
				drawComponets(g);
			}
		});
		addListeners();
		displayMainFrame();
	}

	private void addListeners() {
		// TODO im not sure if i like that cast,
		mainFrame.addKeyListener((KeyListener) input);
	}

	private void displayMainFrame() {
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	private void drawComponets(Graphics g) {
		// TODO make background configurable
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, mainFrame.getWidth(), mainFrame.getHeight());
		
		g.setColor(Color.WHITE);
		g.drawString("Hello World", 50, 50);

		for (Entity entity : entityManager.getEntities()) {
			g.drawImage(entity.getImage(), (int) entity.getxLocation(),
					(int) entity.getyLocation(), entity.getWidth(),
					entity.getHeight(), null);
		}
	}

	private void configureGuiComponets() {
		mainFrame.setMinimumSize(new Dimension(400, 400));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
