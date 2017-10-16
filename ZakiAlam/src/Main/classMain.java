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
		System.out.println("Hey , Welcome to Red Ruby Restaurant "
				+ "\nPlease provide the keys to V.P guys for car parking");
		System.out.println("For Dine in press 1 or press 2 for Takeaway");

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
			ct = new CustomerT();

			System.out.println("Car parked safely , Table alloted ");
			System.out
					.println("Press 1 for Normal Water or press 2 for Mineral Water , Else press 3");
			i = in.nextInt();
			w = i;
			if (i == 2) {
				w = 2;
				Order water = new Order(701, "Bisleri-Bottle", "Rs.20");
				cd.save_Customer_OrderDetails(water);

			}
		}

		else if (i == 2) {
			w = 0;
			cd = new CustomerD(true);
			ct = new CustomerT();
		}

		boolean f = true;
		boolean lb = true;
		Menu mn = new Menu();
		List<Order> ol = null;
		while (f) {
			lb = true;

			System.out
					.println("MENU \nPress 1 for NonVeg \nPress 2 for Veg \nPress 3 for Beverages \nPress 4 for Dessert \nPress 5 for Indian Breads \nPress 6 to Exit");
			i = in.nextInt();

			int choice;

			switch (i) {
			case 1:
			case 2: {
				System.out
						.println("Press 1 for Starters\nPress 2 for MainCourse");
				choice = in.nextInt();
				if (choice != 1 && choice != 2) {
					lb = false;
					System.out.println("Invalid Option , Please try again");
					break;
				}
				ol = mn.show(i, choice);
				// System.out.println(ol);
				break;
			}

			case 3: {
				ol = mn.show(i, -1);
				break;
			}
			case 4: {
				ol = mn.show(i, -1);
				break;
			}
			case 5: {
				ol = mn.show(i, -1);
				break;
			}
			default: {
				System.out.println("Thanks for your Time");
				System.exit(0);
				cd.save_Customer_Order_Id();
				// lb = false;
				break;
			}

			}

			if (lb == false) {
				continue;
			}

			Iterator itr = ol.iterator();
			boolean z = true;
			int id = 0;
			while (z) {
				lb = true;
				System.out
						.println("Press the ID No to select the order else press 0 to go back");
				id = in.nextInt();
				itr = ol.iterator();
				while (itr.hasNext()) {
					Order or = (Order) itr.next();
					if (or.getItem_id() == id) {
						lb = false;
						break;
					}
				}
				if (id == 0) {
					z = false;
					break;
				}

				if (lb == true) {
					System.out.println("Please Enter a Valid ID");
					continue;
				}

				userorders = cd.get_Customer_OrderDetails();
				Iterator itruo = userorders.iterator();
				int q = -1;
				while (itruo.hasNext()) {
					Order o = (Order) itruo.next();
					if (id == o.getItem_id()) {
						System.out
								.println("Order contains this Item ,Do you want to change the Quantity ?\nIf NO press 0 , else press the New Quantity No");
						q = in.nextInt();
						if (q < 0) {
							System.out.println("Invalid Quantity");
							break;
						} else if (q == 0) {
							break;
						}
						o.setItem_quantity(q);
						System.out.println("Quantity Updated");
						break;
					}

				}

				itr = ol.iterator();
				// , Order Quantity
				if (q == -1) {

					while (itr.hasNext()) {
						Order o = (Order) itr.next();
						if (id == o.getItem_id()) {
							System.out
									.println("Please Enter the Quantity of the Order");
							q = in.nextInt();
							if (q <= 0) {
								System.out
										.println("Please Enter a valid Quantity");
								break;
							}
							o.setItem_id(id);
							o.setItem_quantity(q);
							cd.save_Customer_OrderDetails(o);

							break;
						}

					}

				}
			}

			if (lb == true) {
				cd.save_Customer_Order_Id();
				cd.PrintOrdersDetails();
				System.out
						.println("\nWish to Confirm the Order Press 1 \nWish to Add more Items Press 2 \nWish to Edit the Order Press 3\nWish to Cancel the Order Press 4");

				i = in.nextInt();
				if (i == 1) {
					f = false;
					break;
				} else if (i == 3) {

					System.out.println("Press the Item_id for Options");
					id = in.nextInt();
					List ord = cd.get_Customer_OrderDetails();
					Iterator ix = ord.iterator();
					i = -1;
					while (ix.hasNext()) {
						Order temp = (Order) ix.next();
						if (id == temp.getItem_id()) {
							System.out
									.println("Press 1 to Remove the Item , Press 2 to Change the Quantity ,Press 0 to Cancel");
							i = in.nextInt();
							if (i == 1) {
								cd.get_Customer_OrderDetails().remove(temp);
								System.out.println("Item Removed");
								break;
							} else if (i == 2) {
								System.out
										.println("Please Enter the Quantity of the order");
								int q = in.nextInt();
								if (q <= 0) {
									System.out
											.println("Please Enter a valid Quantity");
									break;
								}
								temp.setItem_quantity(q);
								System.out.println("Quantity Updated");
							}
						}

					}
					if (i == -1) {
						System.out.println("Invalid ID");
					}
					System.out.println("Updated Order :");
					cd.PrintOrdersDetails();
					System.out
							.println("Please Press 1 to Generate the Bill,  Press 2 to continue");
					i = in.nextInt();
					if (i == 1) {
						if (cd.get_Customer_OrderDetails().isEmpty()) {
							System.out
									.println("Sorry ,Add some Items to Generate the Bill");
							continue;
						}

						f = false;
						break;
					}

				}

				else if (i == 4) {
					System.out.println("Its..Okay .THanks for your time.");
					System.exit(0);
				}
			}

		}

		Bill b = null;
		if (w == 0) {

			System.out.println("Please Enter your name");
			String n = in.next();
			cd.save_Customer_Name(n);
			System.out.println("Please Enter your Mobile  No .");
			float no = in.nextFloat();
			ct.setCust_cell(no);

			System.out.println("Your bill is");
			cd.setCust_take_away(ct);

			b = new Bill("TakeAway", cd);

		} else {

			b = new Bill("DineIN", cd, cd.getCust_tableno());

		}

		b.PrintBill();

		System.out
				.println("Wanna Give FeedBack! Press 1 for it \nPress 0 to exit");

		i = in.nextInt();

		if (i == 1 && w != 0) {
			System.out.println("Please Enter your Name");
			String name = in.next();

			System.out.println("Please Enter your CellNo");
			float no = in.nextFloat();
			ct.setCust_cell(no);
			System.out.println("Please Enter How you felt !!");
			String feed = in.next();
			cd.save_Customer_Name(name);
			cd.save_Customer_Feedback(feed);

		} else if (w == 0 || w == 3) {
			System.out.println("Please Enter How you felt !!");
			String feed = in.next();
			cd.save_Customer_Feedback(feed);

		}

		System.out.println("Thanks for your time , Visit Us Again.");

	}

}
