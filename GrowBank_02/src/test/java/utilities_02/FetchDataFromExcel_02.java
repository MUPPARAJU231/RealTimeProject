package utilities_02;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import constants_02.ConstantsData_02;


public class FetchDataFromExcel_02 
{
	public static String getURL() throws IOException
	{
		FileInputStream fs=new FileInputStream(ConstantsData_02.ExcelPath);
		XSSFWorkbook worbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=worbook.getSheetAt(0);
	    XSSFCell value=	sheet.getRow(1).getCell(0);
	    String URLValue=value.toString();
	    worbook.close();
	    return URLValue;
	}
}
