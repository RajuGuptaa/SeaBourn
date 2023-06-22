package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {
	public String getdata(String string) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.PropertyPath);
		p.load(fis);
		return p.getProperty(getdata("url"));
	}
	
}
