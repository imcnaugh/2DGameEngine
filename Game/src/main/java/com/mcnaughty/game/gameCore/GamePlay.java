package com.mcnaughty.game.gameCore;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcnaughty.game.domainObjects.Entity;

public class GamePlay implements Runnable {

	@Autowired
	private EntityManager entityManager;

	private boolean gameRunning;
	private long tick;

	private long milisecondsInTick;

	public GamePlay() {
		gameRunning = true;
		tick = 0;
	}

	public void run() {
		while (gameRunning) {
			// movment
			for (Entity entity : entityManager.getEntities()) {
				entity.onTick(tick);
			}
			
			//CollisionDetection
			//TODO implement			
			try {
				Thread.sleep(milisecondsInTick);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tick++;
		}
	}

	public long getMilisecondsInTick() {
		return milisecondsInTick;
	}

	public void setMilisecondsInTick(long milisecondsInTick) {
		this.milisecondsInTick = milisecondsInTick;
	}
}
