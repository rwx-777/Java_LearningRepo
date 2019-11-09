//Egal

public class Anakonda {//Name der Klasse

	public static void Hallo_Methode(String Pole1) { //Parameter
		
		System.out.println("Hallo" + Pole1);
	}
	
	
	
	public static void main(String[] args) { //Main Methode
		System.out.println("Hello"); //First Command
		
		//Datatype | Name of the Variable | Value
		String Pole1 = "Krispin"; //String stores Letters
		int Alter = 29; //Int stores Numbers
		
		System.out.println(Pole1 + " ist " + Alter + " jahre alt.");
		
		System.out.println(Pole1.length()); //returns the length of the variables Value
		
		Hallo_Methode("Nowak");
		
	//##################################################################	
		
		//FACEBOOK LOGIN Example Code
		
		//Your Password must be at least 4 Characters long
		String password = "abcd";
		String RichtigePassword = "abcd";
		
		if (password.length() < 4) {
			System.out.println("Please enter a Password with a minimum of 4 characters");
		}else if(password.length() >= 4){
			if(password == RichtigePassword) {
				System.out.println("Password is correct");
			}else {
				System.out.println("Password is incorrect");
			}
		}else {
			System.out.println("Password is not valid input/ Dont type Shit bro");
		}
		
		//####################################################

	}

}
