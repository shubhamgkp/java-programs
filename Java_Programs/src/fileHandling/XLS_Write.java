package fileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


public class XLS_Write {

	public static void main(String[] args) throws IOException, WriteException {
		
		File file = new File("E:/STUDY_STUFF/SQA/SELENIUM_TESTING/Gurgaon_Class/Selenium/testdatawrite.xls");
		WritableWorkbook wk = Workbook.createWorkbook(file);
		WritableSheet sheet = wk.createSheet("skv", 0);
		
		Label l00 = new Label(0, 0, "Emp ID");
		Label l10 = new Label(1, 0, "Emp Name");
		Label l20 = new Label(2, 0, "Emp Adress");
		sheet.addCell(l00);
		sheet.addCell(l10);
		sheet.addCell(l20);
		
		Label l01 = new Label(0, 1, "1234");
		Label l11 = new Label(1, 1, "Rohit");
		Label l21  = new Label(2, 1, "Meerut");
		sheet.addCell(l01);
		sheet.addCell(l11);
		sheet.addCell(l21);
		
		Label l02 = new Label(0, 2, "2580");
		Label l12 = new Label(1, 2, "Shubham");
		Label l22 = new Label(2, 2, "Gurgaon");
		sheet.addCell(l02);
		sheet.addCell(l12);
		sheet.addCell(l22);		
		wk.write();
		wk.close();
	}
}
