package com.mcnaughty.spaceInvaders;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcnaughty.game.gameCore.GameCore;

public class SpaceInvadersMain {

	public static void main(String[] args) throws IOException {
		new SpaceInvadersMain();
	}

	private SpaceInvadersMain() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		GameCore gameCore = (GameCore) ctx.getBean(GameCore.class);
		gameCore.startGame();
	}
}