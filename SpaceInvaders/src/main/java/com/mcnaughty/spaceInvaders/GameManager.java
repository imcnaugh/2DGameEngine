package com.mcnaughty.spaceInvaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.gameCore.GameCore;
import com.mcnaughty.game.gameCore.GameStateManager;
import com.mcnaughty.spaceInvaders.entity.TestPlayer;
import com.mcnaughty.spaceInvaders.gameStates.PlayState;

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
	private GameStateManager gameStateManager;

	@Autowired
	private TestPlayer player;

	public void setupGame() {
		// TODO add level objects that
		// entityManager.getEntities().add(player);
		PlayState play = new PlayState("play", player);

		gameStateManager.addGameState(play);
		gameStateManager.setCurrentState(play);

		gameCore.startGame();
	}
}