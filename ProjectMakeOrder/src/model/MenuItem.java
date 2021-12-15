package model; 

import java.util.ArrayList;

	public class MenuItem{
		
		private String name; 
		private double price; 
		private int MenuItemStock;
	public void setName(String name) {
		this.name = name;  
	} 
	
	public String getName(){
		return name; 		
	}
	
	public void setPrice(Double price) {
		this.price = price; 
 	}
	
	public double getPrice(double price){
		return price; 	
	}

	public int getMenuItemStock() {
		return MenuItemStock;
	}

	public void setMenuItemStock(int menuItemStock) {
		MenuItemStock = menuItemStock;
	}

	}	