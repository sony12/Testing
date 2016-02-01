package selinum_intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_sheet {

	public static void main(String[] args) {
		excel_sheet sheet = new excel_sheet();
		try {
			sheet.getUsername();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public userBean getUsername() throws FileNotFoundException {
		String FilePath = "/Users/SelfService/desktop/first.xlsx";
		FileInputStream fs;
		userBean bean=new userBean();
		try {
			fs = new FileInputStream(FilePath);
			
			XSSFWorkbook wb = new XSSFWorkbook(fs);
		// Workbook wb = Workbook.getWorkbook(fs);
			XSSFSheet sh = wb.getSheetAt(0); // this is to get the access to
												// Sheet1.
	
			XSSFCell Cell = sh.getRow(1).getCell(0);
			String userName = Cell.getStringCellValue();
			XSSFCell Cell1 = sh.getRow(1).getCell(1);
			String passWord = Cell1.getStringCellValue();
			System.out.println(userName);
			System.out.println(passWord);
			bean.setUserName(userName);
			bean.setPassWord(passWord);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//System.out.println("hi baasfasdfas");
		}

		// XSSFWorkbook
		
		return bean;
		}
}
