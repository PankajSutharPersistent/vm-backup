package com.psl.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Start {
	public static void main(String[] args)
	{
		Car car=new Car("Lamborghini", "Aventedor Coupe", "Black");
		car.setEngine(new Engine(1200, FuelType.PETROL, 600));
		FuelType.PETROL.getcombustionTempratuee();
		
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("car-db"));
			oos.writeObject(car);
			oos.close();
			
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("car-db"));
			try {
				Car c=(Car) ois.readObject();
				
				System.out.println(c.getMake());
				
				System.out.println(c.getModel());
				System.out.println(c.getColor());
				System.out.println(c.getEngine().getFuelType()    );
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ois.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
