

package com.learn2drive.bean;

import java.util.Date;

public class License {
	private long lNumber;
	private Date issueDate,renewalDtae;
	private String issiungRTO;
	public long getlNumber() {
		return lNumber;
	}
	public void setlNumber(long lNumber) {
		this.lNumber = lNumber;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getRenewalDtae() {
		return renewalDtae;
	}
	public void setRenewalDtae(Date renewalDtae) {
		this.renewalDtae = renewalDtae;
	}
	public String getIssiungRTO() {
		return issiungRTO;
	}
	public void setIssiungRTO(String issiungRTO) {
		this.issiungRTO = issiungRTO;
	}
	public License(long lNumber, Date issueDate, Date renewalDtae,
			String issiungRTO) {
		super();
		this.lNumber = lNumber;
		this.issueDate = issueDate;
		this.renewalDtae = renewalDtae;
		this.issiungRTO = issiungRTO;
	}
	public License() {
		super();
	}
	
	

}
