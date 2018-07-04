package io.altar.jseproject.control;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;


import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.EntityRepository;

import io.altar.jseproject.repositories.ShelfRepository;

@RequestScoped
public class Controlshelf {

	static EntityRepository <Shelf> DbShelf = ShelfRepository.getIntance();
	
	public static void createShelf(Shelf s) {
		DbShelf.addEntity(s);
	}
	public static void editShelf(Shelf s){
		DbShelf.editEntity(s);
	}
	
	public static void removeShelf(Shelf s) {
		DbShelf.removeEntity(s);
		}
	
	public static Collection<Shelf> getShelf(){
		return DbShelf.getEntity();
	
	}
	
}
