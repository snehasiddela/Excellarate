package propertyfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;

import genericrepository.FrameworkConstant;

/**
 * this class is used to provide the utility methods to Handle property file
 * 
 * 
 * @author DELL
 **/

public class ReadPropertyFile implements FrameworkConstant {

	public static FileInputStream fis;
	public FileOutputStream fos;
	public Properties P;

	public String ReadData(String key) {
		// step1: convert physical file into java readable object by using
		// fileinputStream class
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 P = new Properties();
		try {
			P.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return P.getProperty(key);

	}

	public void WriteData(){
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 P = new Properties();

		P.put("key", "value");
		try {
			P.store(fos, "updated successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
