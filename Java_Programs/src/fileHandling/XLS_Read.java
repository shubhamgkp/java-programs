package fileHandling;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class XLS_Read {

	public static void main(String[] args) throws BiffException, IOException {

		File file = new File("E:/STUDY_STUFF/SQA/SELENIUM_TESTING/Gurgaon_Class/Selenium/testdata.xls");

		Workbook wk = Workbook.getWorkbook(file);
		Sheet sheet = wk.getSheet(0);
		int row =sheet.getRows();
		int column = sheet.getColumns();
		
		System.out.println(row);
		System.out.println(column);

		for(int i=0;i<row;i++){

			for(int j=0;j<column;j++){

				Cell cell =sheet.getCell(j, i);
				System.out.println(cell.getContents());
			}
		}
	}
}
