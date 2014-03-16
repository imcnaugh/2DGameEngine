package com.mcnaughty.spaceInvaders;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.domainObjects.Entity;
import com.mcnaughty.game.gameCore.EntityManager;
import com.mcnaughty.game.gameCore.GameCore;
import com.mcnaughty.spaceInvaders.entity.TestPlayer;

/*
 * TODO change the name of this class, actually this 
 * will probably look completely different in a few days
 */
@Component
public class GameManager {

	@Autowired
	private GameCore gameCore;

	@Autowired
	private EntityManager entityManager;

	public void setupGame() {
		try {
			Entity player = new TestPlayer(100, 100, 100, 100,
					"src/main/resources/images/test.jpg");

			entityManager.getEntities().add(player);

			gameCore.startGame();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
