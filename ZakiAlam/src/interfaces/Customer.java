package interfaces;

import java.util.List;

import PojoClasses.Order;

public interface Customer {

	public void save_Customer_Name(String name);

	public void save_Customer_Id();

	public void save_Customer_Number(float no);

	public void save_Customer_Vehicle();

	// public void save_Customer_Total(float total) ;
	public void save_Customer_Feedback(String feed);

	public void save_Customer_Order_Id();

	public void save_Customer_OrderDetails(Order order);

	public List<Order> get_Customer_OrderDetails();

	public void get_Customer_Name();

	public int get_Customer_Id();

	public String get_Customer_Feedback();
	
	public int get_Customer_Order_Id(); 

}
