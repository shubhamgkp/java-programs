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

public class XLS_CorrespndsRowColOut {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {

		XLS_CorrespndsRowColOut obj = new XLS_CorrespndsRowColOut();
		String out = obj.CorrespndceRowCOl(1, 1);
		System.out.println(out);
	}

	public String CorrespndceRowCOl(int row, int col) throws IOException, RowsExceededException, WriteException, BiffException{
		File file = new File("E:/STUDY_STUFF/SQA/SELENIUM_TESTING/Gurgaon_Class/Selenium/testdata.xls");

		Workbook wk = Workbook.getWorkbook(file);
		Sheet sheet = wk.getSheet(0);
		Cell cell =sheet.getCell(col, row);
		return cell.getContents();
	}
}
