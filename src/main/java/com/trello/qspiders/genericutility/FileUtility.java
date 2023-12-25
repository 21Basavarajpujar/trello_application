package com.trello.qspiders.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * 
	 * @param key
	 * @return string value
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String readData(String key) throws FileNotFoundException, IOException {
		Properties pobj = new Properties();
		pobj.load(new FileInputStream("./src/test/resources/Basu.properties"));
		String value = pobj.getProperty(key);
		return value;
	}
}