package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Entity;

public class ShelfRepository extends EntityRepository <Entity> {

private static final ShelfRepository INSTANCE = new ShelfRepository(); 
	
	public static ShelfRepository getIntance() {
		return INSTANCE; 
	}
	 
	private ShelfRepository() {
		super();
		
		}
	}