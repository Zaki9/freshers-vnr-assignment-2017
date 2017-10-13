package PojoClasses;

public class Order {
	public int item_id = 0 ;
	public String item_name = "" ;
	public float item_cost= 0 ;
	public int item_quantity = 0 ;
	
	
	
	public Order(int item_id, String item_name, float item_cost) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_cost = item_cost;
		this.item_quantity =1;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public float getItem_cost() {
		return item_cost;
	}
	public void setItem_cost(float item_cost) {
		this.item_cost = item_cost;
	}
	public int getItem_quantity() {
		return item_quantity;
	}
	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}
	

}
