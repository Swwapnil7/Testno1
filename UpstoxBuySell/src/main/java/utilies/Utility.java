package utilies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	public static String getDataFromExcel(int row,int col ) 
			throws EncryptedDocumentException, IOException 
	{
		String data1;
		FileInputStream excel_file = new FileInputStream("C:\\Users\\acer\\Desktop\\Test case for CoWin.xlsx");		
//		Sheet S1=WorkbookFactory.create(excel_file).getSheet("userId&password");	
		Sheet value = WorkbookFactory.create(excel_file).getSheet("userId&password");
		try 
		{
			 data1 = value.getRow(row).getCell(col).getStringCellValue();
			
		}
		catch(IllegalStateException q)
		{
			double a = value.getRow(row).getCell(col).getNumericCellValue();
			data1=String.valueOf(a);  
		}	
		return data1;
		
	}
	public static void getScreenShot(WebDriver driver,int testID) throws IOException 
	{
		Date date = new Date();
		SimpleDateFormat dateform = new SimpleDateFormat("ddmmyy hh mm ss" );
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		File dest = new File("G:\\velocity\\Pom images\\Test_a"+ testID +dateform.format(date)+".jpg");
		FileHandler.copy(src, dest);
		
	}

}
