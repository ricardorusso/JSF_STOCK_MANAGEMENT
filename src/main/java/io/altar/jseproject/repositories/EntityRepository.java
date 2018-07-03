package io.altar.jseproject.repositories;

import java.util.Collection;
//import java.util.HashMap;
import java.util.LinkedHashMap;

import io.altar.jseproject.model.Entity;
//import java.util.Map;

public abstract class EntityRepository  <T extends Entity> {

	LinkedHashMap <Long, T> map = new LinkedHashMap<>() ;
	private long maiorID = 1;
	 
	
	public Long addEntity( T Entity) {
		try {
			map.put(maiorID, Entity);
			Entity.setID(maiorID); 
			return maiorID++;
		}
		catch (IllegalArgumentException e) {
			
			System.out.println("ID null");
			return null;
		}
	}
	
//	public void getEntity() {
//		for(T Entity : map.values()) {
//			System.out.println(Entity);
//			
//		}
//	}
	public Collection<T> getEntity() {
		return map.values();
	}
	
	
	public T getEntity(long ID) {
		try {
			T Entity = map.get(Long.valueOf(ID));
		//System.out.println(Entity);
		return Entity;
		}
		catch (IllegalArgumentException e) {
			System.out.println("ID null");
			return null;
			}
	}
	
	public void editEntity(T Entity) {
		try {
			map.put(Entity.getID(), Entity);
		}
		catch (IllegalArgumentException e) {
			System.out.println("ID null");
					
		}
	}

	public void removeEntity(long ID) {
		map.remove(ID);
	}

}
