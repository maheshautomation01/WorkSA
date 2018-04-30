package com.wsa.qa.util;


import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.wsa.qa.testbase.TestBase;


public class ExcelReader extends TestBase{
	
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static Object[][] data;
	

	public static Object[][] dataread(String filename, String sheetname) throws Exception{
		FileInputStream fip = new FileInputStream(filename);
		book = new XSSFWorkbook(fip);
		sheet = book.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		int columncount = sheet.getRow(0).getLastCellNum();
		//System.out.println(columncount);
		data = new Object[rowcount][columncount];
		for(int i=0;i<rowcount;i++){
			for(int j=0;j<columncount;j++){
				data[i][j]= sheet.getRow(i+1).getCell(j).toString();
				
			}
						
		}
			
		return data;
		
	}
	
	public static String getContractNo() throws Exception{
		FileInputStream fip1 = new FileInputStream(prob.getProperty("sheetpath"));
		book = new XSSFWorkbook(fip1);
		sheet = book.getSheet(prob.getProperty("addtionalsheet"));
		String Contractno = sheet.getRow(1).getCell(1).getStringCellValue();
		return Contractno;
	}
	
	public static String getOwnerNo() throws Exception{
		FileInputStream fip2 = new FileInputStream(prob.getProperty("sheetpath"));
		book = new XSSFWorkbook(fip2);
		sheet = book.getSheet(prob.getProperty("addtionalsheet"));
		String Ownerno = sheet.getRow(2).getCell(1).getStringCellValue();
		return Ownerno;
	}
	
}
