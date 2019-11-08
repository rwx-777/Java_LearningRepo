//2019 Java Learning Repo
//Basic Calculator V1
//written by rwx777

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in); // Reading from System in

		int number1;
		int ScheiseNumber;

		char operator;

		int result = 0;

		System.out.println("Enter the first Number: ");
		number1 = reader.nextInt();

		System.out.println("Enter an operator: ");
		operator = reader.next().charAt(0);

		System.out.println("Enter second Number: ");
		ScheiseNumber = reader.nextInt();

		if (operator == '+') {
			result = number1 + ScheiseNumber;
		} else if (operator == '-') {
			result = number1 - ScheiseNumber;
		} else if (operator == '/') {
			result = number1 / ScheiseNumber;
		} else if (operator == '*') {
			result = number1 * ScheiseNumber;
		} else {
			System.out.println("Invalid Operator");
		}

		System.out.println("The result is: \n" + result);
		reader.close();

		// \n stands for newline

	}

}
