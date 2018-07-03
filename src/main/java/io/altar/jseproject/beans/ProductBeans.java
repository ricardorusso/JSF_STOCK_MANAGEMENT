package io.altar.jseproject.beans;

import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jseproject.control.ControlProduct;
import io.altar.jseproject.model.Product;


import javax.enterprise.context.RequestScoped;

@Named("ProductBean")
@RequestScoped

public class ProductBeans  {
	
	private Product p = new Product();
	
	@Inject
	private ControlProduct cp;
	

	public ControlProduct getCp() {
		return cp;
	}

	public void setCp(ControlProduct cp) {
		this.cp = cp;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}
	public  void createProduct(Product p) {
		ControlProduct.createProduct(p);
		//return "index";
	}
	public void checkProduct() {
		ControlProduct.getProduct();
	}
}
