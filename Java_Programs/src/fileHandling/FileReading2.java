package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading2 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str;
		
		while((str=br.readLine())!=null) {			
			System.out.println(str);
		}
		
	}
}
