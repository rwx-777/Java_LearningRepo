//2019 Java Learning Repo
//Basic File Writer V2
//written by rwx777

//Problems:
//1. Code doesn't handle spaces well 
//Solved changing next() to nextLine()

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Basic_FileWriterV2 {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);

		String Text_to_Write;
		String Path; // Path to File to be stored

		System.out.println("Please enter the Text you want to write into the File: ");
		Text_to_Write = reader.nextLine();

		System.out.println("Please enter the File Path where to want to store the Text: ");
		Path = reader.nextLine();

		if (!Text_to_Write.isEmpty() && !Path.isEmpty()) {
			try (FileWriter fileWriter = new FileWriter(Path, true)) { // Set true for append mode

				PrintWriter printWriter = new PrintWriter(fileWriter);
				printWriter.println(Text_to_Write); // new line
				printWriter.close();

				System.out.println("All Done Sir");

			} catch (FileNotFoundException e) {
				e.printStackTrace(); // Print out Errors if something goes wrong
			}

		} else {
			System.out.println("Usage: <Text to File> <FileLocation>");
		}
		reader.close();
	}

}
