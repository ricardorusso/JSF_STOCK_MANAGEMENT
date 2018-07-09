package io.altar.jseproject.beans;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jseproject.control.Controlshelf;
import io.altar.jseproject.model.Shelf;

@Named ("ShelfBean")
@RequestScoped

public class ShelfBeans {
	private Shelf s = new Shelf();
	
	@Inject
	private Controlshelf cs;
	
	public Controlshelf getCs() {
		return cs;
	}

	public void setCs(Controlshelf cs) {
		this.cs = cs;
	}

	public Shelf getS() {
		return s;
	}

	public void setS(Shelf s) {
		this.s = s;
	}
	
	public String createShelf() {
		cs.createShelf(s);
		return "index";
	}
	public void removeShelf(Shelf s) {
		cs.removeShelf(s);
		
	}
	
	
	public Collection<Shelf> getShelf(){
		return cs.getShelf();
	}
	
	
	
	
	

}
