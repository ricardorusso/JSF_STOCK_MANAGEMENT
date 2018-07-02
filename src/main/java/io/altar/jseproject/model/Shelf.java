package io.altar.jseproject.model;

public class Shelf extends Entity {
	
	//private int ID;
	private int capacity;
	public Product productName;
	private float price;
	
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public int getCapacaty(){
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
	public Shelf(int capacaty, Product productName, float price) {
		this.capacity= capacaty;
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
	public void setProductNameD(Product productName) {
		this.productName = productName;


	}
	
	
}
