//2019 Java Learning Repo
//Basic Calculator V2
//written by rwx777

import java.util.Scanner;

public class Calculator_wMethods {

	public static Scanner reader = new Scanner(System.in);

	public static int number1;
	public static int number2;
	public static char operator;

	public static int result = 0;

	public static void Addition() {
		result = number1 + number2;
	}

	public static void Subtraction() {
		result = number1 - number2;
	}

	public static void Division() {
		result = number1 / number2;
	}

	public static void Multiply() {
		result = number1 * number2;
	}

	public static void main(String[] args) {

		System.out.println("Enter the First Number: ");
		number1 = reader.nextInt();

		System.out.println("Enter the operator");
		operator = reader.next().charAt(0);

		System.out.println("Enter second Number: ");
		number2 = reader.nextInt();

		if (operator == '+') {
			Addition();
		} else if (operator == '-') {
			Subtraction();
		} else if (operator == '/') {
			Division();
		} else if (operator == '*') {
			Multiply();
		} else {
			System.out.println("Invalid Operator Dude !");
			

		}
		System.out.println("Your result is: ");
		System.out.println(result);
		reader.close();
	}

}
