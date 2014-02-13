package com.mcnaughty.gameCore;

import java.util.List;

import com.mcnaughty.domainObjects.Entity;

public class GameCore implements Runnable {

	private boolean gameRunning;
	private long tickNumber = 0;

	private List<Entity> entitys;

	private void setUp() {

	}

	public void run() {

		this.setUp();

		gameRunning = true;

		while (gameRunning) {
			
			for(Entity entity : entitys){
				entity.onTick(tickNumber);
			}
			
			

			tickNumber++;
		}

	}

}
