package com.mcnaughty.game.gameCore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mcnaughty.game.domainObjects.GameState;

@Component
public class GameStateManager {

	private GameState currentState;

	private List<GameState> gameStates;

	public GameStateManager() {
		gameStates = new ArrayList<GameState>();

	}

	// public GameStateManager(GameState originalGameState) {
	// this.currentState = originalGameState;
	// }

	public void addGameState(GameState gameState) {
		this.gameStates.add(gameState);
	}

	public GameState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(GameState currentState) {
		this.currentState = currentState;
	}
}
