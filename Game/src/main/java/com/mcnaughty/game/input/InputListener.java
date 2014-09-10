package com.mcnaughty.game.input;

public interface InputListener {
	public void keyPressed(int keyCode);
	public void keyReleased(int keyCode);
	public void mousePressed(int mouseButtonCode, int xCord, int yCord);
	public void mouseReleased(int mouseButtonCode, int xCord, int yCord);
}
