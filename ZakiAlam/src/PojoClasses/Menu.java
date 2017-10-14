package PojoClasses;

import java.util.List;

import Main.ReadFile;

public class Menu {

	public List<Order> show(int i, int choice) {
		// TODO Auto-generated method stub
		if (i == 1 && choice == 1) {
			ReadFile rf = new ReadFile("src\\DataFiles\\StarterNonVeg.txt");
			return rf.readOrder();

		} else if (i == 1 && choice == 2) {
			ReadFile rf = new ReadFile("src\\DataFiles\\MainCourseNonVeg.txt");
			return rf.readOrder();
			

		} else if (i == 2 && choice == 1) {
			ReadFile rf = new ReadFile("src\\DataFiles\\StarterVeg.txt");
			return rf.readOrder();
		} else if (i == 2 && choice == 2) {
			ReadFile rf = new ReadFile("src\\DataFiles\\MainCourseVeg.txt");
			return rf.readOrder();

		}
		else if(i==3)
		{
			ReadFile rf = new ReadFile("src\\DataFiles\\Beverages.txt");
			return rf.readOrder();
		}
		else if(i==4)
		{
			ReadFile rf = new ReadFile("src\\DataFiles\\Dessert.txt");
			return rf.readOrder();
		}
		else if(i==5)
		{
			ReadFile rf = new ReadFile("src\\DataFiles\\IndianBreads.txt");
			return rf.readOrder();
		}
		return null;

	}

}
