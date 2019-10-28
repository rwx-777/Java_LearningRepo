//Simple MadLips Game coded in Java
//2019 Java Learning Repo
//written by rwx-777

import java.util.Random;

public class MadLipsGame_V1 {

	public static void main(String[] args) {
		
		//Here i just init 3 Differnt String Arrays
		String[] color = {"Red","Blue", "Green", "White"};
		String[] Names = {"Peter", "Stewie", "Brian","Cleveland"};
		String[] verb = {"shit", "janky", "wanky", "wonky"};
		
		//Initialize new Random Object
		Random rand = new Random();
		
		int RandNum = rand.nextInt(5); //Will choose random number between 0 - 4
		
		System.out.println("Roses are " + color[RandNum]);
		System.out.println(Names[RandNum] + " is goo");
		System.out.println("My Code is sort of kinda " + verb[RandNum] + " too");
		
		

	}

}
