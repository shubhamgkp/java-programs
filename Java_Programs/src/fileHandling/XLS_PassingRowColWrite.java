package fileHandling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class XLS_PassingRowColWrite {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		passRowCol(4, 2);
	}
	public static void passRowCol(int row, int col) throws BiffException, IOException, RowsExceededException, WriteException{

		File file = new File("E:/STUDY_STUFF/SQA/SELENIUM_TESTING/Gurgaon_Class/Selenium/testdatawrite.xls");

		System.out.println("Please enter the data");
		Scanner sc = new Scanner(System.in);

		WritableWorkbook wk = Workbook.createWorkbook(file);
		WritableSheet sheet = wk.createSheet("skv", 0);

		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++){				
				String str = sc.nextLine();
				Label lab = new Label(j, i, str);
				sheet.addCell(lab);		
			}
		}
		wk.write();
		wk.close();
	}

}
