package io.altar.jseproject.repositories;


import io.altar.jseproject.model.Shelf;

public class ShelfRepository extends EntityRepository <Shelf> {

private static final ShelfRepository INSTANCE = new ShelfRepository(); 
	
	public static ShelfRepository getIntance() {
		return INSTANCE; 
	}
	 
	private ShelfRepository() {
		super();
		
		}
	}