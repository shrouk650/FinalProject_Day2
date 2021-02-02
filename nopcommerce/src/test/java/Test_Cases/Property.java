package Test_Cases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
	Properties prop = new Properties();
	public String get_property(String KeyName) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\Data.properties");
		prop.load(file);
		return prop.getProperty(KeyName);
	}

	public void set_property(String Keyname, String value) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir" + "\\Data.properties"));
		prop.load(file);
		prop.getProperty(Keyname, value);
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir" + "\\Data.properties"));
		prop.store(fos, "Test");

	}
}
