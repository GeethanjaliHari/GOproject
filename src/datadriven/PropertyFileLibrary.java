package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileLibrary {
	public static String getData(String filePath, String key)
	{
		String data="";
		try {
			FileInputStream property=new FileInputStream(filePath);
			Properties prop=new Properties();
			prop.load(property);
			data=prop.getProperty(key);
			return data;
		}
		catch(IOException e) {
			System.out.println(e);
		}
		return data;
	}
	
	public static Properties getValuesFromPropFile(String filePath)
	{
		Properties prop=new Properties();
		try {
			FileInputStream property=new FileInputStream(filePath);
			
			prop.load(property);
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		return prop;
	}

}
