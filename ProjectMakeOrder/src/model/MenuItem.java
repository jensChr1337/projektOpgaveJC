package model; 

import java.util.ArrayList;

	public class MenuItem{
		
		public String name; 
		public double price; 
		public int MenuItemStock;
	
		public void setName(String name) {
		this.name = name;  
	} 
	
	public String getName(){
		return name; 		
	}
	
	public double getPrice() {
		return price; 
	}
	
	public void setPrice(double price){
		this.price = price; 	
	}

	public int getMenuItemStock() {
		return MenuItemStock;
	}

	public void setMenuItemStock(int menuItemStock) {
		MenuItemStock = menuItemStock;
	}

	}	