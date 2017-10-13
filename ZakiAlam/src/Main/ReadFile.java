package Main;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import PojoClasses.Manager;
public class ReadFile {
 private String file_name="" ;


public ReadFile(String file_name) {
	super();
	this.file_name = file_name;
}
 
 
public Manager readManager( int cust_tableno){
	 
	try {
		BufferedReader in = new BufferedReader(new FileReader(this.file_name));
		String line;
		int x= 1+(int)(Math.random()*3);
		System.out.println(x); int c=1;
		while((line = in.readLine()) != null)
		{
		    if(c==x)
		    break ;
		    c++;
		}
		in.close();
        String [] arr = line.split(" ");
        Manager m = new Manager(Integer.parseInt(arr[0]), arr[1], arr[2], Float.parseFloat(arr[3]), cust_tableno); 
        return m;
        

		
 	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
	
	
	
	return null;
	
}
 
 
}
