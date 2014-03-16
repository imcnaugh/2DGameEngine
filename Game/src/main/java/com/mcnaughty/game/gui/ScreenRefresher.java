package com.mcnaughty.game.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//TODO find a better name for this, holy crap is refresher even a word?
@Component
public class ScreenRefresher implements Runnable {

	@Autowired
	private MainGui mainGui;
	
	@Override
	public void run() {
		while(true){
			
			
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}