package com.mcnaughty.game.gameCore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mcnaughty.game.domainObjects.Entity;

@Component
public class EntityManager {
	List<Entity> entitys;

	public EntityManager() {
		entitys = new ArrayList<Entity>();
	}
	
	public List<Entity> getEntities(){
		return entitys;
	}
}