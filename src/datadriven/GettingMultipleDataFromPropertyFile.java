package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class GettingMultipleDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		String filePath="E:\\GO project\\Datadriven property file\\config.properties";
		FileInputStream propertyFile=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(propertyFile);
		// To get multiple data from property file we use KeySet()
		Set<Object> set=prop.keySet();
		//Use enhanced for loop to iterate over multiple data
		for(Object key:set)
		{
			System.out.println(key +":"+prop.get(key));
		}
	}

}
