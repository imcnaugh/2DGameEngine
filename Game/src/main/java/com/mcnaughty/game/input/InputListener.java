package com.mcnaughty.game.input;

public interface InputListener {
	public void keyPressed(int keyCode);
	public void keyReleased(int keyCode);
	public void mousePressed(int mouseButtonCode);
	public void mouseReleased(int mouseButtonCode);
	public void mouseMoved(int xPos, int yPos);
}
