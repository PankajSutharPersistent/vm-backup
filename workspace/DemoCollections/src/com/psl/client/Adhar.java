package com.psl.client;

public class Adhar {
	
	private String adharNumber;
	private String mobileNumber;
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Adhar(String adharNumber, String mobileNumber) {
		super();
		this.adharNumber = adharNumber;
		this.mobileNumber = mobileNumber;
	}
	public Adhar() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((adharNumber == null) ? 0 : adharNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adhar other = (Adhar) obj;
		if (adharNumber == null) {
			if (other.adharNumber != null)
				return false;
		} else if (!adharNumber.equals(other.adharNumber))
			return false;
		return true;
	}
	
	
	

}
