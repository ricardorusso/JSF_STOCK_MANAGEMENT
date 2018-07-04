package io.altar.jseproject.control;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import io.altar.jseproject.model.Entity;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.EntityRepository;
import io.altar.jseproject.repositories.ProductRepository;

@RequestScoped
public class ControlProduct {
		
		static EntityRepository <Entity> DbProduct = ProductRepository.getIntance();
		
		public static void createProduct(Product p) {
			
			DbProduct.addEntity(p);
			
		}
		
		public static Collection<Entity> getProduct() {
			return DbProduct.getEntity();
			
		}
		
		
		
		
		
		
}
