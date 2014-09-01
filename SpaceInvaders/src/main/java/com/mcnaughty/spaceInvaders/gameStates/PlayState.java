package com.mcnaughty.spaceInvaders.gameStates;

import com.mcnaughty.game.domainObjects.GameState;
import com.mcnaughty.spaceInvaders.entity.TestPlayer;

public class PlayState extends GameState {

	private TestPlayer player;

	public PlayState() {
		this("testing", null);
	}

	public PlayState(String name, TestPlayer player) {
		super(name);
		this.player = player;
		addEntity(this.player);
	}

	@Override
	public void onTick(long tick) {

	}

}
