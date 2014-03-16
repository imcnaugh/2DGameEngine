package com.mcnaughty.game.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.domainObjects.Entity;
import com.mcnaughty.game.gameCore.EntityManager;
import com.mcnaughty.game.input.Input;

@Component
public class DrawArea extends JPanel {
	private static final long serialVersionUID = 1L;

	@Autowired
	private Input input;

	@Autowired
	private EntityManager entityManager;
	
	public DrawArea(){
		this.addKeyListener((KeyListener) input);
	}
	
	public void paintComponent(Graphics g) {
		drawGameplay(g);
	}
	


	private void drawGameplay(Graphics g) {
		// TODO make background configurable
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 400, 400);

		for (Entity entity : entityManager.getEntities()) {
			g.drawImage(entity.getImage(), (int) entity.getxLocation(),
					(int) entity.getyLocation(), entity.getWidth(),
					entity.getHeight(), null);
		}
	}

}
