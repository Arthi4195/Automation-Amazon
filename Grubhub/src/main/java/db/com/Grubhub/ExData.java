package db.com.Grubhub;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;


public class ExData {
	//@Test@ignore
	public void writeText() throws IOException {

	
	File f = new File("C:\\Users\\arthi\\eclipse-workspace\\Grubhub\\Book1.xlsx");
	FileOutputStream fos = new FileOutputStream(f);
	Workbook wb = new XSSFWorkbook();
	Sheet Csheet = wb.createSheet("Arthi");
	Row Crow = Csheet.createRow(0);
	Cell Ccell = Crow.createCell(0);
	Ccell.setCellValue (5555);
	
	Cell Ccell1 = Crow.createCell(1);
	Ccell1.setCellValue("aaassd");
	wb.write(fos);
	System.out.println("add row");
	
	 
	}
	@Test
		public void ReadText() throws IOException {
			File f = new File("C:\\Users\\arthi\\eclipse-workspace\\Grubhub\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook();
		Sheet SSheet = wb.getSheetAt(0);
		System.out.println(+SSheet.getPhysicalNumberOfRows());
//System.out.println(+getSSheet.getLastRowNum());
		
	}
	}
		


