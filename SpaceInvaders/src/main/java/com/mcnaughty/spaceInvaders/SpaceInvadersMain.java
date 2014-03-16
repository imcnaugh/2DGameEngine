package com.mcnaughty.spaceInvaders;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcnaughty.game.domainObjects.Entity;
import com.mcnaughty.game.gameCore.EntityManager;
import com.mcnaughty.game.gameCore.GameCore;
import com.mcnaughty.spaceInvaders.entity.TestPlayer;

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