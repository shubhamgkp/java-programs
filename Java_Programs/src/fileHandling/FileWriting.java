package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\testwrite.txt");
		FileWriter fr = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fr);
		
		bw.newLine();
		bw.write("Gorakhpur");
		bw.newLine();
		bw.write("Allahabad");
		bw.newLine();
		bw.write("Haridwar");	
		bw.newLine();;
		bw.write("Lucknow");
		bw.newLine();
		bw.write("Panipat");
		bw.close();
	}
}
