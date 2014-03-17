package com.mcnaughty.spaceInvaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.gameCore.EntityManager;
import com.mcnaughty.game.gameCore.GameCore;
import com.mcnaughty.spaceInvaders.entity.TestPlayer;

/*
 * TODO change the name of this class, actually this 
 * will probably look completely different in a few days
 * 
 * TODO also add collision detection to either the gameCore
 * thread or in its own thread,
 */
@Component
public class GameManager {

	@Autowired
	private GameCore gameCore;

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private TestPlayer player;

	public void setupGame() {
		entityManager.getEntities().add(player);

		gameCore.startGame();
	}
}