package com.psl.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.psl.util.Utility;

@RunWith(value=Parameterized.class)
public class ParameteraisedFactorialTest {
	private long number,expectedResult;

	public ParameteraisedFactorialTest(long number, long expectedResult) {
		super();
		this.number = number;
		this.expectedResult = expectedResult;
	}
	
	
	
	@Parameters
	public static Collection<Long []> data(){
		
		Long [][] values={
				
				{4L,24L},
				{6L,720L},
				{8L,40320L}
				
				
		};
		return Arrays.asList(values);
				
		
		
		
	}
	
	@Test
	public void testFactorial()
	{
		
		long actualResult;
		actualResult=new Utility().factorial(number);
		Assert.assertEquals(expectedResult, actualResult);
		
		
		
		
	}

}
