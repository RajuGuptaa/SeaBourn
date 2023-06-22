package GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {
	public String PropertiesFile(String key) throws IOException {
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(AutoConstant.propertyparth);
	p.load(fis);
	return p.getProperty(key);
	}}
