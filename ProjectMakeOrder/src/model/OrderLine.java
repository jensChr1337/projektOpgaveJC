package model;


public class OrderLine { 


	private int quantity; 
	private MenuItem item;
		
	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}
	public int getQuantity() { 
		return quantity; 
	
	}
	public double getSubTotal() {
	return item.getPrice() * quantity;
	}
	
	public MenuItem getItem() {
		return item;
	}
	public void setItem(MenuItem item) {
		this.item = item;
	}




}
