package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	public static void main(String[] args) throws Exception {
		File src = new File("/Users/SelfService/Desktop/exceldata.xlsx");
		FileInputStream  fis = new FileInputStream (src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheetone= wb.getSheetAt(0);
		String Data = sheetone.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from excel is"+Data);

	}

}
