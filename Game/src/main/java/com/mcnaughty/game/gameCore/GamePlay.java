package com.mcnaughty.game.gameCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.domainObjects.Entity;

@Component
public class GamePlay implements Runnable {

	@Autowired
	private EntityManager entityManager;

	private boolean gameRunning;
	private long tick;

	public GamePlay() {
		gameRunning = true;
		tick = 0;
	}

	public void run() {
		while (gameRunning) {
			for (Entity entity : entityManager.getEntities()) {
				entity.onTick(tick);
			}
			try {
				//TODO un hard code the frame rate
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tick++;
		}
	}
}
