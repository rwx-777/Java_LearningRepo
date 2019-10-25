//2019 Java Learning Repo
//Simple Java Learning Script
//written by rwx-777


public class Java_LearningScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayHello("Elliot");
		newline();
		
		//What are Datatypes ?
		//Datatypes are diffrent types we can use to store values/Data makes sense right ?
		//Dont worry I'll show you
		
		String characterName = "Bruce Wayne"; //Now the value/name "Bruce Wayne is stored in the variable charactername
		//Now what is a String ? I would say a String is a Datatype to store text
		System.out.println(characterName);//Here we print out the value inside the variable characterName
		
		
		//if you want to store Numbers there are a few other Datatypes
		//The first one is int
		int someNumber = 7;
		System.out.println(someNumber);
		
		//doubles store numbers too but they store numbers with t
		double someOtherNum = 3.2; 
		System.out.println(someOtherNum);
	}
	
	//Method to print out a newline
	public static void newline() { //void is a function that doesnt return anything
		System.out.println("\n");
	}
	
	public static void SayHello(String name) { //Here we give this method a Parameter (name)
		System.out.println("Hello " + name);
	}

}
