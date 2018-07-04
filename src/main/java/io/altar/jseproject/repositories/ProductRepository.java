package io.altar.jseproject.repositories;


import io.altar.jseproject.model.Product;

public class ProductRepository extends EntityRepository <Product>{
	
	private static final ProductRepository INSTANCE = new ProductRepository(); 
	
	public static ProductRepository getIntance() {
		return INSTANCE; 
	}
	 
	private ProductRepository() {
		super();
		
	}
	
}
