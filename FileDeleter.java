
//2019 Java Learning Repo
//Basic File Deleter V1
//written by rwx777

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDeleter {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter File Path: ");

		try {
			final long startTime = System.currentTimeMillis(); 

			Files.deleteIfExists(Paths.get(reader.nextLine()));

			final long endTime = System.currentTimeMillis();

			System.out.println("Deletion successful.");
			long timetook = ((endTime - startTime) / 1000);
			System.out.println("Total time: " + timetook + "s"); //prints out time it took

		} catch (NoSuchFileException e) {
			System.out.println("No such file or Directory.");
		} catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty.");
			System.out.println("Deletion not successful.");
		} catch (IOException e) {
			System.out.println("Invalid permissions.");
		}

	}

}
