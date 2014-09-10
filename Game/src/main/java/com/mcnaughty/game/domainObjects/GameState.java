package com.mcnaughty.game.domainObjects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public abstract class GameState {
	
	private final String NAME;
	
	private List<Entity> entitys;
	

	public GameState(String name) {
		this.NAME = name;
		entitys = new ArrayList<Entity>();
	}
	
	public List<Entity> getEntities(){
		return entitys;
	}
	
	public String getName(){
		return NAME;
	}
	
	public void addEntity(Entity entity){
		entitys.add(entity);
	}

	public abstract void onTick(long tick);
}
