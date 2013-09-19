package syp.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Util {
	
	public static String readProperty(String key, String defaultValue) {
		Properties properties = new Properties();
		FileReader reader = null;
		try {
			File file = new File("syp.properties");
			reader = new FileReader(file);
			properties.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return properties.getProperty(key, defaultValue);
	}

}
