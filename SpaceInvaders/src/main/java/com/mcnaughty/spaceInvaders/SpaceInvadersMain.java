package com.mcnaughty.spaceInvaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mcnaughty.game.gui.MainGui;

@Component
public class SpaceInvadersMain {

	@Autowired
	private MainGui mainGui;

	public static void main(String[] args) {
		new SpaceInvadersMain();
	}

	private SpaceInvadersMain() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
//		mainGui = (MainGui) ctx.getBean(MainGui.class);
		
		mainGui.displayMainFrame();
	}
}