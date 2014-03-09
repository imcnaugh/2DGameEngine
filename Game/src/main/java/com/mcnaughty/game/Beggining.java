package com.mcnaughty.game;

import com.mcnaughty.game.gui.MainGui;

public class Beggining {

	public static void main(String[] args) throws InterruptedException {
		new Beggining();
	}

	public Beggining() throws InterruptedException {
//		MainGui mainGui = new MainGui();
		String[] strA = new String[] {"hello", "world", "test"};
		TestClass test = new TestClass(strA);
		test.printStr();
		strA = new String[] {"new", "text"};
		test.printStr();
		
	}
}

class TestClass{
	private String[] strings;
	
	public TestClass(String[] str){
		strings = str;
	}
	
	public void printStr(){
		for(String s : strings){
			System.out.println(s);
		}
	}
	
	
}