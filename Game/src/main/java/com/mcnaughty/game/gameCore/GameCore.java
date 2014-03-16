package com.mcnaughty.game.gameCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.gui.MainGui;

@Component
public class GameCore {

	@Autowired
	private MainGui maingui;

	@Autowired
	private GamePlay gamePlay;

	public GameCore() {
	}
	
	public void startGame(){
		Thread gamePlayThread = new Thread(gamePlay);
		gamePlayThread.start();
	}
}