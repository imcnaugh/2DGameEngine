package com.mcnaughty.spaceInvaders;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpaceInvadersMain {

	public static void main(String[] args) throws IOException {
		new SpaceInvadersMain();
	}

	private SpaceInvadersMain() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		GameManager manager = ctx.getBean(GameManager.class);
		manager.setupGame();
	}
}