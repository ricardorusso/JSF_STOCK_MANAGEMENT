package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Entity;

public class ProductRepository extends EntityRepository <Entity>{
	
	private static final ProductRepository INSTANCE = new ProductRepository(); 
	
	public static ProductRepository getIntance() {
		return INSTANCE; 
	}
	 
	private ProductRepository() {
		super();
		
	}
	
}
