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
		while((line = in.readLine()) != null)
		{
		    System.out.println(line);
		}
		in.close();
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
