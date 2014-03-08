package com.mcnaughty.game;

import com.mcnaughty.game.input.Input;
import com.mcnaughty.game.input.impl.KeyboardinputImpl;

public class Beggining {
	
	private Input input;
	
	public static void main(String[] args) throws InterruptedException{
		new Beggining();
	}
	
	public Beggining() throws InterruptedException{
		input = new KeyboardinputImpl();
		while(true){
			System.out.println("is up pressed " + input.isUpArrowPressed());
		}
	}
}
