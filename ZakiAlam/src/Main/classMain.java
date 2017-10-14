package Main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import PojoClasses.*;

public class classMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i = 0, w = 0;
		System.out
				.println("Hi Welcome to the Restraunt. . . Please provide the keys to V.P guys for car parking");
		System.out
				.println("For Inside press 1 or Press 2 for Takeaway restraunt");
		List<Order> userorders = null;
		do {
			i = in.nextInt();
			if (i != 1 && i != 2) {
				System.out.println("Please input the right value");
			}
		} while (i != 1 && i != 2);

		CustomerD cd = null;
		CustomerT ct = null;

		if (i == 1) {
			cd = new CustomerD();

			System.out
					.println("car parked safely , table alloted , for normal water press 1 press 2 for mineral else press3");
			i = in.nextInt();w=i;
			if (i == 2) {
				w = 2;
				Order water = new Order(701, "Bisleri Bottle", "20");
				cd.save_Customer_OrderDetails(water);

			}
		} else if (i == 2) {
			w=0;
			cd = new CustomerD(true);
			ct = new CustomerT();
		}

		boolean f = true;
		boolean inv = false;
		Menu mn = new Menu();
		while (f) {
			inv = true;

			System.out
					.println("Press 1 for NonVeg , 2 for Veg , 3 for Beverages , 4 for Dessert , 5 for Indian Breads , anyother key to exit");
			i = in.nextInt();
			// in.next();
			int choice;
			switch (i) {
			case 1:
			case 2: {
				System.out.println("Press 1 for Starters 2 for MainCourse");
				choice = in.nextInt();
				if (choice != 1 && choice != 2) {
					inv = false;
					break;
				}
				List ol = mn.show(i, choice);
				System.out
						.println("Press the id no to select the order else press anything to go back");
				int id = in.nextInt();
				if (id < 110 || id > 1000) {
					System.out.println("Enter a valid id");
					inv = false;
					break;
				}

				userorders = cd.get_Customer_OrderDetails();
				Iterator itruo = userorders.iterator();
				int q = -1;
				while (itruo.hasNext()) {
					Order o = (Order) itruo.next();
					if (id == o.getItem_id()) {
						System.out
								.println("Order Contains this item , do you wnna change the quantity ? if no press 0 , else press the new quantity no");
						q = in.nextInt();
						if (q <= 0) {
							break;
						}
						o.setItem_quantity(q);
						System.out.println("quantity updated");
						break;
					}

				}

				if (q != -1) {
					break;
				}

				Iterator itr = ol.iterator();
				while (itr.hasNext()) {
					Order o = (Order) itr.next();
					if (id == o.getItem_id()) {
						System.out
								.println("Please Enter the Quantity of the order");
						q = in.nextInt();
						if (q <= 0) {
							System.out.println("please enter a valid quantity");
							break;
						}
						cd.save_Customer_OrderDetails(o);

						o.setItem_quantity(q);
						break;
					}

				}

			}

			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				break;
			}
			default: {

				cd.save_Customer_Order_Id();
				inv = true;
				break;
			}

			}

			if (inv == true) {
				cd.save_Customer_Order_Id();
				System.out.println("ORDER DETAILS : ");
				userorders = cd.get_Customer_OrderDetails();
				Iterator itr = userorders.iterator();
				while (itr.hasNext()) {
					Order or = (Order) itr.next();
					System.out.println(or.getItem_name() + " "
							+ or.getItem_quantity() + " " + or.getItem_cost());
				}

				System.out
						.println("Wanna confirm the order 1 , wnna add more 2, cancel 3");
				i = in.nextInt();
				if (i == 1) {
					break;
				} else if (i == 3) {
					System.out.println("Its..okay .THanks for your time.");
					System.exit(0);
				}
			}

		}
		Bill b = null;
		if (w == 0) {

			System.out.println("Please ENter your name");
			String n = in.next();
			cd.save_Customer_Name(n);
			System.out.println("Please ENter your Mobile  No .");
			float no = in.nextFloat();
			ct.setCust_cell(no);

			System.out.println("your bill is");
			cd.setCust_take_away(ct);

			b = new Bill("TAKEAway", cd);

		} else {

			b = new Bill("DiveIN", cd);

		}

		b.PrintBill();

		System.out
				.println("Wanna Give FeedBack! PRess 1 for it else press anything to exit");

		i = in.nextInt();

		if (i == 1 && w == 0) {
			System.out.println("Enter your name");
			String name = in.next();

			System.out.println("Enter your cellno");
			float no = in.nextFloat();
			ct.setCust_cell(no);
			System.out.println("Enter the feedback ");
			String feed = in.next();
			cd.save_Customer_Name(name);
			cd.save_Customer_Feedback(feed);

		} else {
			System.out.println("Enter the feedback ");
			String feed = in.next();
			cd.save_Customer_Feedback(feed);

		}

		System.out.println("Thanks for your time , Visit Again");

	}

}
