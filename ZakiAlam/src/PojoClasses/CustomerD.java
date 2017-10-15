	package PojoClasses;

import interfaces.Customer;

import java.util.ArrayList;
import java.util.Iterator;
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
	private CustomerT cust_take_away = null;

	public CustomerD() {

		this.cust_tableno = 1 + (int) (Math.random() * 50);
		this.save_Customer_Id();
		this.save_Customer_Vehicle();
		ReadFile rf = new ReadFile("src\\DataFiles\\manager.txt");
		this.cust_manager_obj = rf.readManager(this.cust_tableno);
		this.cust_order = new ArrayList<Order>();
		this.htm = new HotelManagement();

	}

	public CustomerD(boolean t) {
		this.save_Customer_Id();
		this.save_Customer_Vehicle();
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

	public void save_Customer_Name(String name) {
		// TODO Auto-generated method stub
		this.cust_name = name;

	}

	public void save_Customer_Id() {
		// TODO Auto-generated method stub
		this.cust_idD = (int) (Math.random() * 1000);

	}

	public void save_Customer_Vehicle() {
		// TODO Auto-generated method stub
		this.cust_vehno = "AP04" + (int) (Math.random() * 1000);

	}

	public void save_Customer_Feedback(String feed) {
		// TODO Auto-generated method stub
		this.cust_feed = feed;

	}

	public void save_Customer_OrderDetails(Order order) {
		// TODO Auto-generated method stub
		this.cust_order.add(order);

	}

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

	public void get_Customer_Name() {
		// TODO Auto-generated method stub

	}

	public int get_Customer_Id() {
		// TODO Auto-generated method stub
		return this.cust_idD;

	}

	public String get_Customer_Feedback() {
		// TODO Auto-generated method stub
		return this.cust_feed;

	}

	public void save_Customer_Number(float cust_cell) {
		// TODO Auto-generated method stub
		this.cust_cell = cust_cell;

	}

	public List<Order> get_Customer_OrderDetails() {
		// TODO Auto-generated method stub
		return this.cust_order;
	}

	public int get_Customer_Order_Id() {
		// TODO Auto-generated method stub
		return this.cust_order_id;
	}

	public CustomerT getCust_take_away() {
		return cust_take_away;
	}

	public void setCust_take_away(CustomerT cust_take_away) {
		this.cust_take_away = new CustomerT();
		this.cust_take_away = cust_take_away;
	}
	public void PrintOrdersDetails(){
		System.out.println("ORDER DETAILS : ");

		System.out.printf("%-22s%-22s%-22s%-22s%-22s\n", "Item_ID",
				"Item", "Quantity", "Cost", "Total_Cost");

		System.out.printf("%-22s%-22s%-22s%-22s%-22s\n", "-------",
				"-------", "-------", "-------", "-------");
		List<Order> userorders = this.get_Customer_OrderDetails();
		Iterator itr = userorders.iterator();
		while (itr.hasNext()) {
			Order or = (Order) itr.next();
			String arr[] = or.getItem_cost().split("\\.");
			String s = "Rs."
					+ String.valueOf(Integer.parseInt(arr[1])
							* or.getItem_quantity());
			System.out.printf("%-22s%-22s%-22s%-22s%-22s\n",
					or.getItem_id(), or.getItem_name(),
					or.getItem_quantity(), or.getItem_cost(), s);

		
		
		
		
	}

}
}