//2019 Java Learning Repo
//Basic Folder Deleter V1
//written by rwx777

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Scanner;

public class Basic_FolderDeleter {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter Directory Path: ");
		
		Path rootPath = Paths.get(reader.nextLine());
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
			System.out.println("Total time: " + SecondsTook + "s or " + MillisTook + "ms"); //prints out time it took
					
		}catch (IOException e) {
			e.printStackTrace();
		}
		reader.close();
		
	}

}
