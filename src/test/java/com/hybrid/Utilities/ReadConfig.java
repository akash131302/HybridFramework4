package com.hybrid.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties prop;
	
	String path="C:\\Users\\DELL\\eclipse-workspace\\HybridFramework2\\Configuration\\Config.Properties";

	
	public ReadConfig() {
		
		prop=new Properties();
		
		try {
			FileInputStream F=new FileInputStream(path);
			prop.load(F);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBaseUrl() {
		
		String value=prop.getProperty("baseURL");
		
		if(value!=null) {
		return value;
		}
		else {
			
			throw new RuntimeException("URL NOT SPECIFIED IN CONFIG FILE");
		}
		
		
	}
	
	public String getBrowser() {
		
		String browser=prop.getProperty("browser");
		
		if(browser!=null) {
			return browser;
		}
		else {
			
			throw new RuntimeException("BROWSER NOT SPECIFIED IN CONFIG FILE");
		}
	}
}


