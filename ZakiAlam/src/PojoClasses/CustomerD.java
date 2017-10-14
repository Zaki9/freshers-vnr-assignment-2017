package PojoClasses;

import interfaces.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Main.ReadFile;

public class CustomerD implements Customer {
	private int cust_idD = 0;
	private int cust_tableno = 0;
	private String cust_vehno = "";
	private String cust_name = "";// f
	private String cust_add = "";// f
	private float cust_cell = 0; // f
	private String cust_feed = ""; // f
	private Manager cust_manager_obj = null;
	private int cust_order_id = 0;
	private HotelManagement htm = null;
	private List<Order> cust_order = null;

	public CustomerD() {

		this.cust_tableno = 1 + (int) (Math.random() * 50);
		this.save_Customer_Id();
		this.save_Customer_Vehicle();
		ReadFile rf = new ReadFile("src\\DataFiles\\manager.txt");
		this.cust_manager_obj = rf.readManager(this.cust_tableno);
		this.cust_order = new ArrayList<Order>();
		this.htm = new HotelManagement();

	}

	public int getCust_idD() {
		return cust_idD;
	}

	public int getCust_tableno() {
		return cust_tableno;
	}

	public String getCust_vehno() {
		return cust_vehno;
	}

	public String getCust_name() {
		return cust_name;
	}

	public String getCust_add() {
		return cust_add;
	}

	public float getCust_cell() {
		return cust_cell;
	}

	public String getCust_feed() {
		return cust_feed;
	}

	public Manager getCust_manager_obj() {
		return cust_manager_obj;
	}

	@Override
	public void save_Customer_Name(String name) {
		// TODO Auto-generated method stub
		this.cust_name = name;

	}

	@Override
	public void save_Customer_Id() {
		// TODO Auto-generated method stub
		this.cust_idD = (int) (Math.random() * 1000);

	}

	@Override
	public void save_Customer_Vehicle() {
		// TODO Auto-generated method stub
		this.cust_vehno = "AP04" + (int) (Math.random() * 1000);

	}

	@Override
	public void save_Customer_Feedback(String feed) {
		// TODO Auto-generated method stub
		this.cust_feed = feed;

	}

	@Override
	public void save_Customer_OrderDetails(Order order) {
		// TODO Auto-generated method stub
		this.cust_order.add(order);

	}

	@Override
	public void save_Customer_Order_Id() {
		// TODO Auto-generated method stub
		this.cust_order_id = (int) (Math.random() * 5001);

	}

	public int getCust_order_id() {
		return cust_order_id;
	}

	public HotelManagement getHtm() {
		return htm;
	}

	@Override
	public void get_Customer_Name() {
		// TODO Auto-generated method stub

	}

	@Override
	public int get_Customer_Id() {
		// TODO Auto-generated method stub
		return this.cust_idD;

	}

	@Override
	public String get_Customer_Feedback() {
		// TODO Auto-generated method stub
		return this.cust_feed;

	}

	@Override
	public void save_Customer_Number(float cust_cell) {
		// TODO Auto-generated method stub
		this.cust_cell = cust_cell;

	}

	@Override
	public List<Order> get_Customer_OrderDetails() {
		// TODO Auto-generated method stub
		return this.cust_order;
	}

	@Override
	public int get_Customer_Order_Id() {
		// TODO Auto-generated method stub
		return this.cust_order_id;
	}

}