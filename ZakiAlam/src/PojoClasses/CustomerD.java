package PojoClasses;
import Main.ReadFile;
public class CustomerD {
	private int cust_idD= 0 ;
	private int cust_tableno= 0 ;
	private String cust_vehno= "" ;
	private String cust_park= "" ;
	private String cust_name= "" ;
	private String cust_add= "" ;
	private int cust_cell= 0;
	private float cust_total= 0 ;
	private String cust_feed= "" ;
	private Manager cust_manager_obj= null ;
	
	
	
	
	

	public CustomerD() {
		
		this.cust_idD = (int) Math.random()*1000; 
		this.cust_tableno=(int)Math.random()*50; 
		this.cust_vehno= "AP04" +(int)Math.random()*1000; 
		this.cust_park= "A"; 
		ReadFile rf = new ReadFile("src\\DataFiles\\manager.txt") ; 
		this.cust_manager_obj = rf.readManager(this.cust_tableno); 
		System.out.println(this.cust_manager_obj);
		

		
		
		
		
	}
	public int getCust_idD() {
		return cust_idD;
	}
	public void setCust_idD(int cust_idD) {
		this.cust_idD = cust_idD;
	}
	public int getCust_tableno() {
		return cust_tableno;
	}
	public void setCust_tableno(int cust_tableno) {
		this.cust_tableno = cust_tableno;
	}
	public String getCust_vehno() {
		return cust_vehno;
	}
	public void setCust_vehno(String cust_vehno) {
		this.cust_vehno = cust_vehno;
	}
	public String getCust_park() {
		return cust_park;
	}
	public void setCust_park(String cust_park) {
		this.cust_park = cust_park;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_add() {
		return cust_add;
	}
	public void setCust_add(String cust_add) {
		this.cust_add = cust_add;
	}
	public int getCust_cell() {
		return cust_cell;
	}
	public void setCust_cell(int cust_cell) {
		this.cust_cell = cust_cell;
	}
	public float getCust_total() {
		return cust_total;
	}
	public void setCust_total(float cust_total) {
		this.cust_total = cust_total;
	}
	public String getCust_feed() {
		return cust_feed;
	}
	public void setCust_feed(String cust_feed) {
		this.cust_feed = cust_feed;
	}
	public Manager getCust_manager_obj() {
		return cust_manager_obj;
	}
	public void setCust_manager_obj(Manager cust_manager_obj) {
		this.cust_manager_obj = cust_manager_obj;
	}
	 
}