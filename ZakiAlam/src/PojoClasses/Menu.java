package PojoClasses;

import java.util.List;

import Main.ReadFile;

public class Menu {

	public List<Order> show(int i, int choice) {
		// TODO Auto-generated method stub
		if(i==1&&choice==1){
	    ReadFile rf = new ReadFile("src\\DataFiles\\StarterNonVeg.txt") ; 
	    return rf.readOrder();

		}
		else if(i==1&&choice==2){
			
		}
		else if(i==2&&choice==1){
		}
		else if(i==2&&choice==2){
		

		}
		return null;

		
		
	}

}
