package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\test.txt");
		FileReader fr = new FileReader(file);
		int a;
				
		while ((a=fr.read())!=-1) {			
			System.out.print((char)a);
		}
		
	}
}
