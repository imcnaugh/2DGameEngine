package com.mcnaughty.game.gui;

import org.springframework.beans.factory.annotation.Autowired;

//TODO find a better name for this, holy crap is refresher even a word?
public class ScreenRefresher implements Runnable {

	@Autowired
	private DrawArea drawArea;

	private int fps;

	@Override
	public void run() {
		while (true) {
			try {
				// TODO tripple buffer in here
				drawArea.repaint();
				Thread.sleep(1000 / fps);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public int getFps() {
		return fps;
	}

	public void setFps(int fps) {
		this.fps = fps;
	}
}