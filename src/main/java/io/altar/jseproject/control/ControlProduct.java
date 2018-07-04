package io.altar.jseproject.control;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;


import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.EntityRepository;
import io.altar.jseproject.repositories.ProductRepository;

@RequestScoped
public class ControlProduct {
		
		static EntityRepository <Product> DbProduct = ProductRepository.getIntance();
		
		public static void createProduct(Product p) {
			
			DbProduct.addEntity(p);
			
		}
		
		public static Collection<Product> getProduct() {
			return DbProduct.getEntity();
			
		}
		
		public static void editProduct(Product p) {
			DbProduct.editEntity(p);
		}
		
		public static void removeProduct(Product p) {
			DbProduct.removeEntity(p);
		}
		
}
