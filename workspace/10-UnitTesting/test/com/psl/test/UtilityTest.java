package com.psl.test;

import javax.naming.InitialContext;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.psl.util.BlankEmail;
import com.psl.util.Utility;

public class UtilityTest {
	private Utility utility;
	
	@Before
	public void init()
	{
		utility=new Utility();
	}
	
	
	@After
	public void unInit()
	{
		
	}
	
	@BeforeClass
	public static void setupClass()
	{
		
	}
	
	@Test
	public void testPower() {
		
		int base=3;
		int index=4;
		double expectedResult=81;
		double actualResult=utility.Power(base, index);
		
		Assert.assertEquals(expectedResult, actualResult,0.0);
	}
	
	@Test
	public void testMailIftrue()
	{
		String email="p@gmail..com";
		
		boolean actualResult;
		try {
			actualResult = utility.validate(email);
			Assert.assertTrue(actualResult);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testMailIFFalse()
	{
		String email="p@gmail";
	
		boolean actualResult;
		try {
			actualResult = utility.validate(email);
			Assert.assertFalse(actualResult);

		} catch (BlankEmail e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test(expected=BlankEmail.class)
	public void testBlank() throws BlankEmail
	{
		utility.validate("");
	}
	
	
	

}
