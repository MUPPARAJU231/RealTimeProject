package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constantsData.ConstantData;

public class FetchDataFromProperty
{
	public static Properties readDataFromPropery() throws IOException
	{
		FileReader reader=new FileReader(ConstantData.PropertyFilePath);
		Properties prop=new Properties();
		prop.load(reader);
		return prop;
	}
}
