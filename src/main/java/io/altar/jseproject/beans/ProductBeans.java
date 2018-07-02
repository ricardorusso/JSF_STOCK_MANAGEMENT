package io.altar.jseproject.beans;

import javax.inject.Named;

import io.altar.jseproject.model.Product;
import javax.enterprise.context.RequestScoped;

@Named("Product")
@RequestScoped

public class ProductBeans  {
	private  Product p ;
	
	

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}
	
	
}
