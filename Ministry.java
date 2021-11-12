package com.example.nsp.layer2;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Ministry {
    
	@Id
	@Column(name = "mid")
	@GeneratedValue
	private int MinistryId;
	
	@Column(name = "pwd")
	private String Password;
	
	@Column(name = "officernm")
	private String OfficerName;
	
	@Column(name = "monum")
	private int MobileNumber;
	
	@Column(name = "eid")
	private String EmailId;
	
	
	public int getMinistryId() {
		return MinistryId;
	}
	public void setMinistryId(int ministryId) {
		MinistryId = ministryId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getOfficerName() {
		return OfficerName;
	}
	public void setOfficerName(String officerName) {
		OfficerName = officerName;
	}
	public int getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
}
