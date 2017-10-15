package PojoClasses;

import java.util.Iterator;
import java.util.List;

import interfaces.Customer;

public class Bill {

	private String order_type = "";
	private float total = 0;
	private String pay_type = "";
	private String coupon = "";
	private Customer cust;
	private int cust_tableno;

	public Bill(String order_type, Customer cust) {
		super();
		this.order_type = order_type;
		this.cust = cust;
	}

	public Bill(String order_type, CustomerD cust, int cust_tableno) {
		super();
		this.order_type = order_type;
		this.cust = cust;
		this.cust_tableno = cust_tableno;

	}

	public void PrintBill() {

		List<Order> ord = this.cust.get_Customer_OrderDetails();
		Order o = null;
		float t = 0;

		System.out.printf("%-22s%-22s%-22s\n", " ", "Invoice", " ");
		System.out.println("Cust_id    " + this.cust.get_Customer_Id());
		System.out.println("C_orderid  " + this.cust.get_Customer_Order_Id());
		System.out.println("Order Type " + this.order_type);
		if (this.order_type.equals("DiveIN")) {
			System.out.println("Customer_Table_no " + this.cust_tableno);
		}
		System.out.printf("%-22s%-22s%-22s%-22s\n", "-------", "-------",
				"-------", "-------");

		System.out.printf("%-22s%-22s%-22s%-22s\n", "Item", "Quantity", "Cost",
				"Total_Cost");
		Iterator itr = ord.iterator();
		while (itr.hasNext()) {
			o = (Order) itr.next();
			String str[] = o.getItem_cost().split("\\.");

			String s = "Rs."
					+ String.valueOf(Integer.parseInt(str[1])
							* o.getItem_quantity());

			System.out.printf("%-22s%-22s%-22s%-22s\n", o.getItem_name(),
					o.getItem_quantity(), o.getItem_cost(), s);

			t += Integer.parseInt(str[1]) * o.getItem_quantity();

		}

		System.out.printf("%-22s%-22s%-22s%-22s\n", "-------", "-------",
				"-------", "-------");
		System.out.printf("%-22s%-22s%-22s%-22s\n", "GST", " ", " ", "Rs "
				+ String.valueOf(t * 36 / 100));
		System.out.printf("%-22s%-22s%-22s%-22s\n", "Sub Total", " ", " ",
				"Rs " + String.valueOf(t));

		System.out.printf("%-22s%-22s%-22s%-22s\n", "Total(Rounding Off)", " ",
				" ", "Rs " + String.valueOf((t + (t * 36) / 100)));

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
