package utilities_02;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants_02.ConstantsData_02;


public class FetchDataFromProperty_02 
{
	public static Properties readDataFromProperty() throws IOException
	{
		FileReader reader=new FileReader(ConstantsData_02.PropertyFilePath);
		Properties prop=new Properties();
		prop.load(reader);
		return prop;
	}
}
