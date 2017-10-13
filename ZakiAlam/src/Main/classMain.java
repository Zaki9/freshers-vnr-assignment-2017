package Main;
import java.util.Scanner;
import PojoClasses.*;

public class classMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=0;
        System.out.println("Hi Welcome to the Restraunt. . . Please provide the keys to V.P guys for car parking");
        System.out.println("For TakeAway press 1 or Press 2 for insides restraunt");
        do{ //warning to be given for wrong ip later
        i = in.nextInt();
        }
        while(i!=1&&i!=2);
      
        if(i==1){
        	CustomerD cd = new CustomerD(); 
        	//System.out.println(cd.getCust_tableno() + " " + cd.getCust_idD());
        }
        else if(i==2)
        {
        
        }
        
        
 	}

}
