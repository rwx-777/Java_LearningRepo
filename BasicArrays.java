import java.util.Arrays;

public class BasicArrays {

	public static void main(String[] args) {
		//What are Arrays ?
		//Arrays are containers
		//Arrays start at 0 !
		
		//Array 1
		String[] names = {"Martin","Josh","Krispin"};
							//0 	//1		//2
		
		String output;
		output = Arrays.toString(names);
		System.out.println(output); //Oirginal version
		System.out.println(names.length);
		names[2] = "Nico"; //Changes Josh to Elliot
		
		//System.out.println(names[1]); 
		//Prints out the Value at index 1
		
		System.out.println(Arrays.toString(names)); //We print out Array again
		
		//Array 2
		String[] rgb_codes = {"032","232","3442"};
		
		
		//Array 3
		int[] ages = {23,45,54,677,98474};
		
		System.out.println(Arrays.toString(ages));
		
		
		
		
		//Array 4
		double[] pricesCola = {4.99, 5,49, 5,99};
		
		System.out.println(Arrays.toString(pricesCola));
		
		//Array Challenge
		//What gets printed out?
		int[] numbers = {1,3,4,77,8,5};
		numbers[0] = 4; //This line changes a value in the Array
		System.out.println(numbers[4]); //This line prints out value 4 in the Array
		System.out.println(Arrays.toString(numbers));
		//Check what gets printed
		
		
	}

}
