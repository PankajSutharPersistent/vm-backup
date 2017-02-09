package com.util;

import java.util.Comparator;

import com.beans.Peripheral;

public class quantityPrice implements Comparator<Peripheral> {

	@Override
	public int compare(Peripheral lhs, Peripheral rhs) {
		// TODO Auto-generated method stub
		int i=lhs.getQuantity()-rhs.getQuantity();
		if(i==0)
		{
			return lhs.getPrice()-rhs.getPrice();
		}
		return i;
	}

}
