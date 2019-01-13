package fileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class XLS_Read_Write {
	
	public static void main(String[] args) throws BiffException, IOException, WriteException {
		
		File file1 = new File("E:/STUDY_STUFF/SQA/SELENIUM_TESTING/Gurgaon_Class/Selenium/testdata.xls");
		File file2 = new File("E:/STUDY_STUFF/SQA/SELENIUM_TESTING/Gurgaon_Class/Selenium/testdatawrite.xls");
		
		Workbook wk1 = Workbook.getWorkbook(file1);
		Sheet sheet1 = wk1.getSheet(0);
		int row1 = sheet1.getRows();
		int col1 = sheet1.getColumns();
		
		WritableWorkbook wk2 = Workbook.createWorkbook(file2);
		WritableSheet sheet2 = wk2.createSheet("skv", 0);	
		
		for(int i=0;i<row1;i++){
			
			for(int j=0;j<col1;j++){
				
				Cell cell = sheet1.getCell(j, i);
				Label lab = new Label(j, i, cell.getContents());
				sheet2.addCell(lab);
			}
		}
		wk2.write();
		wk2.close();
	}

}
