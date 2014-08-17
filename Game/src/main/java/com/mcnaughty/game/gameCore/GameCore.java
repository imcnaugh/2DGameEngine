package com.mcnaughty.game.gameCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.gui.MainGui;
import com.mcnaughty.game.gui.ScreenRefresher;

@Component
public class GameCore {

	@Autowired
	private MainGui maingui;

	@Autowired
	private GamePlay gamePlay;
	
	@Autowired
	private ScreenRefresher screenRefresher;

	public GameCore() {
	}
	
	public void startGame(){
		maingui.setupMainGui();
		Thread gamePlayThread = new Thread(gamePlay);
		Thread redrawThread = new Thread(screenRefresher);

		gamePlayThread.start();
		redrawThread.start();
	}
}