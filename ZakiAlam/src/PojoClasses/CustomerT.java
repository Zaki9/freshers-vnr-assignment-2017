package PojoClasses;

import interfaces.*;

public class CustomerT {

	private String cust_add = "";
	private float cust_cell = 0;
	private String cust_coupon = "";

	public CustomerT(String cust_add, int cust_cell, String cust_coupon) {
		super();
		this.cust_add = cust_add;
		this.cust_cell = cust_cell;
		this.cust_coupon = cust_coupon;
	}

	public CustomerT() {
		// TODO Auto-generated constructor stub
	}

	public String getCust_add() {
		return cust_add;
	}

	public void setCust_add(String cust_add) {
		this.cust_add = cust_add;
	}

	public float getCust_cell() {
		return cust_cell;
	}

	public void setCust_cell(float cust_cell) {
		this.cust_cell = cust_cell;
	}

	public String getCust_coupon() {
		return cust_coupon;
	}

	public void setCust_coupon(String cust_coupon) {
		this.cust_coupon = cust_coupon;
	}

}