package PojoClasses;

public class Manager {
	
	private int manager_id= 0 ;
	private String manager_name= "" ;
	private String manager_add= "" ;
	private float manager_cell= 0 ;
	private int cust_tableno= 0 ;
	
	
	public Manager(int manager_id, String manager_name, String manager_add,
			float manager_cell, int cust_tableno) {
		super();
		this.manager_id = manager_id;
		this.manager_name = manager_name;
		this.manager_add = manager_add;
		this.manager_cell = manager_cell;
		this.cust_tableno = cust_tableno;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getManager_add() {
		return manager_add;
	}
	public void setManager_add(String manager_add) {
		this.manager_add = manager_add;
	}
	public float getManager_cell() {
		return manager_cell;
	}
	public void setManager_cell(float manager_cell) {
		this.manager_cell = manager_cell;
	}
	public int getCust_tableno() {
		return cust_tableno;
	}
	public void setCust_tableno(int cust_tableno) {
		this.cust_tableno = cust_tableno;
	}
	 
}
