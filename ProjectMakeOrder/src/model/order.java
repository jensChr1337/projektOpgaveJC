package model;

import java.util.ArrayList;
import java.util.List;

public class order {

	private int orderNumber;
	private String date;
	private int	quantity; 
	private String status; 
	
	private List<OrderLine> orderlines = new ArrayList<OrderLine>();
	
	public int getQuantity() {
			return quantity; 
	}		
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber; 
	}
	
	public int getOrderNumber() {
		return orderNumber; 
	}
		
	public void setDate(String date) {
		this.date = date; 
	}
	
	public String getDate() {
		return date; 
	}
	
	public String getStatus() {
		return status; 
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	public double getTotalPrice() {
	double totalPrice = 0; 
	for (int idx =0; idx < orderlines.size(); idx++) {
			totalPrice += orderlines.get(idx).getSubTotal();
	}
			return totalPrice * (1 + quantity);		
	}
	
	public List<OrderLine> getOrderlines() {
		return orderlines; 
	}
	
	public static final String ACTIVE = "Active";
	public static final String FINISHED = "Finished";
	
}

	









