package com.cts.project2;


public class Product {

private String pname;
private int qunt;
private float price;

	 
	 public Product(String pname, int qunt, float price) {
	super();
	this.pname = pname;
	this.qunt = qunt;
	this.price = price;
}



	public Product() {
		 
	 }
	
		 

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQunt() {
		return qunt;
	}
	
	

	public void setQunt(int qunt) {
		this.qunt = qunt;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
		 
}






