package com.psl.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("dummy.properties");
			Properties properties=new Properties();
			try {
				properties.load(fis);
				System.out.println(properties.getProperty("server"));
				System.out.println(properties.getProperty("os"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
