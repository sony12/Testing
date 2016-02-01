package selinum_intro;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;
import jxl.read.biff.BiffException;


public class xcel_Start {

	public userBean file_exel_values() throws Exception {
		
		
		File src=new File("/Users/SelfService/Desktop/first.xls");
        System.out.println("Excel Located");
        
      Workbook wb=Workbook.getWorkbook(src);
      userBean abc=null;
       System.out.println("Workbook Loaded");
      for(int i=1;i<=5;i++){
    	  abc=new userBean();
    	  for(int j=0;j<2;j++){
    		  if(j==0){
    			  String data02=wb.getSheet(0).getCell(j,i).getContents();	
        		  System.out.println("Data is "+data02);
        		  abc.setUserName(data02);
        		  
    		  }else{
    			

        		 String data01=wb.getSheet(0).getCell(j, i).getContents();
        	      System.out.println("Data is "+data01);
        	      abc.setPassWord(data01);
        	      
    		  }
    			  
    		  
    		 // String data02=wb.getSheet(0).getCell(0,1).getContents();	
    		 // System.out.println("Data is "+data02);
    		  
    		//  String data01=wb.getSheet(0).getCell(1, 1).getContents();
    	      //System.out.println("Data is "+data01);
    	      
    	  }
    	  
      }
      // String data02=wb.getSheet(0).getCell(0,1).getContents();
      //
       
      //String data01=wb.getSheet(0).getCell(1, 1).getContents();
      //System.out.println("Data is "+data01);
      
      
    int rows=  wb.getSheet(0).getRows();
 int cols=   wb.getSheet(0).getColumns();
 
    System.out.println("Total num of rows in data is"+rows);
      System.out.println("Total num of col in data is"+ cols);
	return abc;
	
	}

}