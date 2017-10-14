package PojoClasses;

import java.util.Iterator;
import java.util.List;

import interfaces.Customer;

public class Bill {

	private String order_type = "";
	private float total = 0;
	private String pay_type = "";
	private String coupon = "";
	// private String food_details= "" ;
	private Customer cust;

	public Bill(String order_type, Customer cust) {
		super();
		this.order_type = order_type;
		this.cust = cust;
	}

	public void PrintBill() {

		List<Order> ord = this.cust.get_Customer_OrderDetails();
		Order o =null;
        float t=0;

		System.out.println("Invoice");
		System.out.println("cust_id "+this.cust.get_Customer_Id());
		System.out.println("c_orderid "+this.cust.get_Customer_Order_Id());
		Iterator itr = ord.iterator();
		while (itr.hasNext()) {
			o= (Order) itr.next();
			System.out.println(o.getItem_name() + " " + o.getItem_cost()+ " "+o.getItem_quantity());
			
			String str[] = o.getItem_cost().split("\\.");
			System.out.println(o.getItem_cost());
			t+=Integer.parseInt(str[1])*o.getItem_quantity() ;
			

		}
		

		
		System.out.println("gst "+ t*36/100);
		System.out.println("sub total  "+ t);
		System.out.println("Total  "+ (t + (t*36)/100));

		

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
