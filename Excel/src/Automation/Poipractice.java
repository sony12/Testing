package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// by muthul owani
public class Poipractice {
	public static void main(String[]args) throws Exception{
		Poipractice prac=new Poipractice();// created object of class
		prac.dataexcel();// By using reference call another class 
		ArrayList ab=prac.dataexcel(); 
		System.out.println(ab);
	}
	public  ArrayList<String> dataexcel() throws Exception{
		
		File src=new File("/Users/SelfService/Desktop/exceldata.xlsx");
		FileInputStream FIS=new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(FIS);
		XSSFSheet sheet1=wb.getSheetAt(0);
	String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	
	ArrayList<String> array=new ArrayList(); // create arraylist to return the value
	
	for(int count=1;count<=sheet1.getLastRowNum();count++){ // create a loop for getting whole data
		
		 XSSFRow row = sheet1.getRow(count);
		 array.add(row.getCell(0).toString());// to print the data form returning  array
		 array.add(row.getCell(1).toString());
		 array.add(row.getCell(2).toString());
         System.out.println("Running test case  "  + row.getCell(0).toString());
         System.out.println("Running test case  "  + row.getCell(1).toString());
         System.out.println("Running test case  "  + row.getCell(2).toString());
         
	}
	
	System.out.println("Data from excel is"+data0);
	return array;
		
	}

}
