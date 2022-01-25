package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {
	public static String getValue(String value) throws Exception {
		
		String path = "./config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(fis);
		//System.out.println(pro.get(value));
		
		
		
	return pro.get(value).toString(); 	
	}
	
	public static void main(String[] args) throws Exception {
		BaseConfig.getValue("URL");
	}
}
