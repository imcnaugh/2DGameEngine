package com.mcnaughty.game.domainObjects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public abstract class GameState {
	
	private final String NAME;
	
	private List<Entity> entitys;
	
	private List<EntityWithHitBox> collisionEntitys;

	public GameState(String name) {
		this.NAME = name;
		entitys = new ArrayList<Entity>();
		collisionEntitys = new ArrayList<EntityWithHitBox>();
	}
	
	public List<Entity> getEntities(){
		return entitys;
	}
	
	public List<EntityWithHitBox> getEntitiesWithHitboxes(){
		return collisionEntitys;
	}
	
	public String getName(){
		return NAME;
	}
	
	public void addEntity(Entity entity){
		entitys.add(entity);
		if(entity instanceof EntityWithHitBox){
			collisionEntitys.add((EntityWithHitBox) entity);
		}
	}

	public abstract void onTick(long tick);
}
