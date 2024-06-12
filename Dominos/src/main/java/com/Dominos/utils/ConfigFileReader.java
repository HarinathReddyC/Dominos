package com.Dominos.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	
	private Properties properties;
	
	private final String propertiesfilepath="src//test//resources//configurations//config.properties";
	
	
	public ConfigFileReader() throws FileNotFoundException {
		
		BufferedReader reader;
		try {
		reader = new BufferedReader(new FileReader(propertiesfilepath));
		
		properties= new Properties();
		
		try {
			
			properties.load(reader);
			reader.close();
					
				
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			throw new RuntimeException("config file is not found in the providedd path" + propertiesfilepath);

		}
		
		
	}
	

	public String getApplicationUrl() {
		
		String url = properties.getProperty("url");
		if(url!= null)
			
			return url;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
		
		
	}
	
	
	public String getBrowserType() {

		String browser = properties.getProperty("url");
		if(browser!= null)
			
			return browser;
		else
			throw new RuntimeException("browser not specified in the config.properties file.");
		
	}
}
