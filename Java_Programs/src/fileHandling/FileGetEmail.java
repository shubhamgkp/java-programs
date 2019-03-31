package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileGetEmail {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		List<String> listEmail = new ArrayList<String>();

		File file = new File("./src/fileHandling/emailContent.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String strLine;

		while((strLine=br.readLine())!=null) {

			final String emailFormat = "([\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Za-z]{2,4})";
			Pattern pat=Pattern.compile(emailFormat);
			Matcher matcher =pat.matcher(strLine);

			while(matcher.find()) {

				String email = matcher.group(1).trim();

				if(!listEmail.contains(email)) {

					listEmail.add(email);
				}
			}
		}

		for(int i=0;i<listEmail.size();i++) {

			System.out.println(listEmail.get(i));
		}		

	}			

}
