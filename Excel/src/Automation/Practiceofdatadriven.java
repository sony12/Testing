package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practiceofdatadriven {
	public static void main(String[]args) throws Exception{
		Practiceofdatadriven many=new Practiceofdatadriven();
		many.data();// 
		ArrayList ab=many.data(); 
		System.out.println(ab);
	}
	public  ArrayList<String> data() throws Exception{
		
		File src=new File("/Users/SelfService/Desktop/newexcel.xlsx");
		FileInputStream FIS=new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(FIS);
		XSSFSheet sheet1=wb.getSheetAt(0);
	String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	
	ArrayList<String> arrays=new ArrayList(); 
	
	for(int count=1;count<=sheet1.getLastRowNum();count++){ 
		 XSSFRow row = sheet1.getRow(count);
		 arrays.add(row.getCell(0).toString());
		 arrays.add(row.getCell(1).toString());
		 arrays.add(row.getCell(2).toString());
         System.out.println("Running test case  "  + row.getCell(0).toString());
         System.out.println("Running test case  "  + row.getCell(1).toString());
         System.out.println("Running test case  "  + row.getCell(2).toString());
         
	}
	
	System.out.println("Data from excel is"+data0);
	return arrays;
		
	}

}
