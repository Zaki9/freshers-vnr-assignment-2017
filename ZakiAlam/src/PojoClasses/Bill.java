package PojoClasses;

import java.util.Iterator;
import java.util.List;

import interfaces.Customer;

public class Bill {
	
	
	private String order_type= "" ;
	private float total= 0 ;
	private String pay_type=  "" ;
	private String coupon= "" ;
	//private String food_details= "" ;
	private Customer cust;
	
	
	
	
	
	public Bill(String order_type, Customer cust) {
		super();
		this.order_type = order_type;
		this.cust = cust;
	}
	
	
	
	public void PrintBill() {
		
		List <Order> ord = this.cust.get_Customer_OrderDetails() ;
		System.out.println(ord);
		
		
		Iterator itr = ord.iterator();
		while (itr.hasNext()) {
			Order o = (Order) itr.next();
			System.out.println(o.getItem_name());
// total		 

		}
		
		
	}
	
	
	
	
	
	
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}




	





}
