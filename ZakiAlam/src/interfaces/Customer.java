package interfaces;

import PojoClasses.Order;

public interface Customer {
 
	public void save_Customer_Name(String name) ;
	public void save_Customer_Id() ;
	public void save_Customer_Vehicle() ;
	public void save_Customer_Total(float total) ;
	public void save_Customer_Feedback(String feed) ;
	public void save_Customer_Order_Id() ;

	void save_Customer_OrderDetails(Order order);
	

  }
