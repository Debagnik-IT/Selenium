package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;

public class ReuseableComponents {
	
	public static Properties prop;
	DataFormatter formatter = new DataFormatter();
	FileInputStream fis;
	
	public String getProperty(String key) throws IOException
	{
		prop=new Properties();
		FileInputStream fis= new FileInputStream("./src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String Value=prop.getProperty(key);
		return Value;
		
	}
	
	public FileInputStream getFis(String path)throws FileNotFoundException
	{
		fis = new FileInputStream(path);
		return fis;
	}

}
