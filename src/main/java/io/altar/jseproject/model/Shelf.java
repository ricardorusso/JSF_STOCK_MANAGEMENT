package io.altar.jseproject.model;

public class Shelf extends Entity {
	
	//private int ID;
	private int capacity;
	public Product productName;
	private float price;
	
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public int getCapacity(){
		return capacity;
	}
	
	
	public Product getProductName(){
		return productName;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	public float getPrice(){
		return price;
	}
	public Shelf() {
		
	}
	public Shelf(int capacity, Product productName, float price) {
		this.capacity= capacity;
		this.productName= productName;
		this.price= price;
	}
	
	public String toString() {
		if (this.productName== null) {
			return "ID " + this.getID() +  " Capacidade: " + this.capacity + " Preco: " + this.price + " Sem produto: ";
		}
		else {
			return "ID " + this.getID() + " Capacidade: " + this.capacity + " Preco: " + this.price + " Produto: " + this.productName.getID();
		}
	}
	public void setProductName(Product productName) {
		this.productName = productName;


	}
	
	
}
