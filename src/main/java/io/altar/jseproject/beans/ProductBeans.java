package io.altar.jseproject.beans;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jseproject.control.ControlProduct;
import io.altar.jseproject.model.Product;

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
	public String createProduct() {
		cp.createProduct(p);
		return "index";
	}

	
	public Collection<Product> getProduct(){
		return cp.getProduct();
	}
	
	public void editProduct(Product p) {
		cp.editProduct(p);
	}
	
	public void removeProduct(Product p) {
		cp.removeProduct(p);
	}
}
