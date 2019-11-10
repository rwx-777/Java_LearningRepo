//2019 Java Learning Repo
//Basic File and Folder Deleter V1
//written by rwx777

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Scanner;

public class Basic_File_and_FolderDeleter {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		
		
		System.out.println("Please enter File Path: ");
		
		String FilePath = reader.nextLine();

		if(FilePath.contains(".")) {
		try {
			final long startTime = System.currentTimeMillis(); 

			Files.deleteIfExists(Paths.get(FilePath));

			final long endTime = System.currentTimeMillis();
			long MillisTook = (endTime - startTime);
			long timetook = ((endTime - startTime) / 1000);

			System.out.println("Deletion successful.");
			System.out.println("Total time: " + timetook + "s/"+ MillisTook + "ms"); //prints out time it took

		} catch (NoSuchFileException e) {
			System.out.println("No such file or Directory.");
			System.out.println("Deletion not successful.");
		} catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty.");
			System.out.println("Deletion not successful.");
		} catch (IOException e) {
			System.out.println("Invalid permissions.");
			System.out.println("Deletion not successful.");
		}
		
		}else {
			
			Path rootPath = Paths.get(FilePath);
			try {
				final long startTime = System.currentTimeMillis(); 
				
				Files.walk(rootPath, FileVisitOption.FOLLOW_LINKS)
						.sorted(Comparator.reverseOrder())
						.map(Path::toFile)   //.peek(System.out::println)
						.forEach(File::delete);
				
				final long endTime = System.currentTimeMillis();
				long MillisTook = (endTime - startTime);
				double SecondsTook = ((endTime - startTime) / 1000);
				
				System.out.println("Deleted Folder " + rootPath +  " succesfully");
				System.out.println("Total time: " + SecondsTook + "s/" + MillisTook + "ms"); //prints out time it took
						
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		reader.close();

	}

}
