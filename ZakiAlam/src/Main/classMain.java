package Main;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import PojoClasses.*;

public class classMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=0 , w=1;
        System.out.println("Hi Welcome to the Restraunt. . . Please provide the keys to V.P guys for car parking");
        System.out.println("For TakeAway press 1 or Press 2 for insides restraunt");
        do{ //warning to be given for wrong ip later
        i = in.nextInt();
        }
        while(i!=1&&i!=2);
      
        if(i==1){
        	CustomerD cd = new CustomerD(); 
        	System.out.println(cd.getCust_tableno() + " " + cd.getCust_vehno() + " " + cd.getCust_manager_obj());
        	System.out.println("car parked safely , table alloted , for normal water press 1 press 2 for mineral else press3");
        	i= in.nextInt();
        	if(i==2){
        		w=2;
        	}
        	Menu mn = new Menu(); 
        	while(true){
        	System.out.println("Press 1 for NonVeg , 2 for Veg , 3 for Beverages , 4 for Dessert , 5 for Indian Breads , anyother key to exit");
        	i=in.nextInt();
        	int choice;
        	switch(i){
        	case 1 : case 2:{
        		System.out.println("Press 1 for Starters 2 for MainCourse");
        		choice = in.nextInt() ; 
        		List ol = mn.show(i,choice) ;
        		System.out.println("Press the id no to select the order else press anything to go back");
        		int id = in.nextInt() ;
         		Iterator itr = ol.iterator();
        		while(itr.hasNext()){
        			Order o = (Order) itr.next();
        			System.out.println(o.getItem_name());
        			if(id==o.getItem_id()){
        				cd.save_Customer_OrderDetails(o);
        				System.out.println("Please Enter the Quantity of the order");
        				int q = in.nextInt() ;
        				o.setItem_quantity(q); 
            			break;
        			}
        			
        		}
        		
               System.out.println( cd.getCust_order());
        		
        		break;
        	}
        	
        	case 3 :{
        		break;
        	}
        	case 4 :{
        		break;
        	}
        	case 5 :{
        		break;
        	}
        	default :{
        		break;
        	}
        	
        	}
        	
        	
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
        else if(i==2)
        {
        
        }
        
        
 	}

}
