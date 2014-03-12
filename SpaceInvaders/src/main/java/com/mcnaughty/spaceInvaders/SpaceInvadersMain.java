package com.mcnaughty.spaceInvaders;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcnaughty.game.domainObjects.Entity;
import com.mcnaughty.game.gameCore.EntityManager;
import com.mcnaughty.game.gui.MainGui;

public class SpaceInvadersMain {

	private MainGui mainGui;

	private EntityManager entityManager;

	public static void main(String[] args) throws IOException {
		new SpaceInvadersMain();
	}

	private SpaceInvadersMain() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		mainGui = (MainGui) ctx.getBean(MainGui.class);
		entityManager = (EntityManager) ctx.getBean(EntityManager.class);
		
		BufferedImage img = ImageIO.read(new File("src/main/resources/images/test.jpg"));
		
		Entity entity = new Entity(500,500,0,0, img) {
			
			@Override
			public void onTick(long tick) {
				//TODO add shit
			}
		};
		entityManager.getEntities().add(entity);
		
	}
}