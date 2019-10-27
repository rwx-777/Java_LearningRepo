//Egal

public class Anakonda {//Name der Klasse

	public static void Hallo_Methode(String Pole1) { //Parameter
		
		System.out.println("Hallo" + Pole1);
	}
	
	
	
	public static void main(String[] args) { //Main Methode
		System.out.println("Hello"); //Erster Befehl
		
		//Datentyp | Name von Variable | Wert
		String Pole1 = "Krispin"; //Datentyp für Buchstaben
		int Alter = 29; //Datentyp für Zahlen
		
		System.out.println(Pole1 + " ist " + Alter + " jahre alt.");
		
		System.out.println(Pole1.length()); //gibt die Zahl der Buchstaben zurück
		
		Hallo_Methode("Nowak");
		
	//##################################################################	
		
		//FACEBOOK LOGIN BEISPIEL CODE
		
		//Dein Passwort muss at least 4 Zeichen lang sein
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
