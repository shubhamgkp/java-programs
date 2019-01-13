package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) throws IOException {

		File file1, file2;
		file1 = new File("E:\\test.txt");
		file2 = new File("E:\\testwrite.txt");
		FileReader fr = new FileReader(file1);
		FileWriter fw = new FileWriter(file2,true);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);		
		String str;

		while((str=br.readLine())!=null) {			
			bw.write(str);
			bw.newLine();
		}
		bw.close();
	}
}
