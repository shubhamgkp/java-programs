package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class XLS_UserInput_Write {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {

		File file = new File("E:/STUDY_STUFF/SQA/SELENIUM_TESTING/Gurgaon_Class/Selenium/testdatawrite.xls");

		System.out.println("Please enter the data");
		Scanner sc = new Scanner(System.in);
		
		WritableWorkbook wk = Workbook.createWorkbook(file);
		WritableSheet sheet = wk.createSheet("skv", 0);

		for(int i=0;i<3;i++){

			for(int j=0;j<3;j++){				
				String str = sc.nextLine();
				Label lab = new Label(j, i, str);
				sheet.addCell(lab);		
			}
		}
		wk.write();
		wk.close();
	}

}
