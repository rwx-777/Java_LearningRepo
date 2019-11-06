//2019 Java Learning Repo
//Basic File Writer V1
//written by rwx777

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Basic_FileWriter {

	public static void main(String[] args) {
		
		String Text_to_Write = "Hello there";
		
		try(PrintWriter out = new PrintWriter("/home/elliot/data.txt") ){ //Path to File to be stored
			
			out.println(Text_to_Write); //Text gets printed out into the File 
			
		}catch (FileNotFoundException e) {
			e.printStackTrace(); //Print out Errors if something goes wrong
		}
		
		//if you see this then everything is fine
		System.out.println("All Done Sir");

	}

}
