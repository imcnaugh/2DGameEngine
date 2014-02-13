package com.mcnaughty.gameCore;

import java.util.List;

import com.mcnaughty.domainObjects.Entity;

public class GameCore implements Runnable {

	private boolean gameRunning;
	private long tickNumber = 0;
	
	private Level[] levels;

	private List<Entity> entitys;

	public GameCore(Level[] levels){
		this.levels = levels;
	}

	public void run() {
		gameRunning = true;

		Level currentLevel = levels[0];
		
		while (gameRunning) {
			
			for(Entity entity : entitys){
				entity.onTick(tickNumber);
			}
			
			

			tickNumber++;
		}

	}

}
