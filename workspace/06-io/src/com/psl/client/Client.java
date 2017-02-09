package com.psl.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		File f_read=new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		File f_write=new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\NewPenguins.jpg");

		try {
			FileInputStream fis=new FileInputStream(f_read);
			FileOutputStream fos=new FileOutputStream(f_write); 
			byte[] byteValue=new byte[1024] ;
			int byteRead;
			while ((byteRead=fis.read(byteValue)) != -1) {
				fos.write(byteValue, 0, byteRead);
				
			}
			
			
			
			fis.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
