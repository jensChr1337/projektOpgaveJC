package model;

import java.awt.MenuItem;

public class orderLine { 


	private int quantity; 
	private MenuItem item;
		
	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}
	public int getQuantity() { 
		return quantity; 
	}
	public MenuItem getItem() {
		return item;
	}
	public void setItem(MenuItem item) {
		this.item = item;
	}
}
