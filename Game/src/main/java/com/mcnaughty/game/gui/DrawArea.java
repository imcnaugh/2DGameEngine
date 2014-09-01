package com.mcnaughty.game.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.domainObjects.Entity;
import com.mcnaughty.game.gameCore.GameStateManager;

@Component
public class DrawArea extends JPanel {
	private static final long serialVersionUID = 1L;

	@Autowired
	private GameStateManager gameStateManager;

	public void paintComponent(Graphics g) {
		drawGameplay(g);
	}

	private void drawGameplay(Graphics g) {
		// TODO make background configurable
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		for (Entity entity : gameStateManager.getCurrentState().getEntities()) {
			// TODO add logic for draw order
			g.drawImage(entity.getImage(), (int) entity.getxLocation(),
					(int) entity.getyLocation(), entity.getWidth(),
					entity.getHeight(), null);
		}
	}
}