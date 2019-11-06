import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in); //Reading from System in
		
		
		int number1;
		int number2;
		
		char operator;
		
		int result = 0;
		
		System.out.println("Enter the first Number: ");
		number1 = reader.nextInt();
		
		System.out.println("Enter an operarator: ");
		operator = reader.next().charAt(0);
		
		System.out.println("Enter second Number: ");
		number2 = reader.nextInt();
		
		
		
		if(operator == '+') {
			result = number1 + number2;
		}else if (operator == '-') {
			result = number1 - number2;
		}else if(operator == '/') {
			result = number1 / number2;
		}else if(operator == '*') {
			result = number1 * number2;
		}else {
			System.out.println("Invalid Operator");
		}
		
		System.out.println("The result is: \n" + result);
		
		// \n stands for newline
		
		
		
		
		
		

	}

}
