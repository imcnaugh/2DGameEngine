package com.mcnaughty.game.gameCore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.domainObjects.Entity;
import com.mcnaughty.game.gui.MainGui;

@Component
public class GameCore implements Runnable {

	private boolean gameRunning;
	private long tickNumber = 0;

	private Level[] levels;

	@Autowired
	private MainGui maingui;

	public GameCore() {
	}

	public void run() {
		gameRunning = true;

		Level currentLevel = levels[0];

		while (gameRunning) {

			tickNumber++;
		}

	}

}
