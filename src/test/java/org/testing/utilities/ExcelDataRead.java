package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataRead {
	public static String readACell(int row,int column) throws BiffException, IOException {
		File f = new File("../apiFrameWork/src/test/java/org/testing/resources/sampledata.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		Cell c1 = ws.getCell(column, row);
		return c1.getContents();
		
	}

}
