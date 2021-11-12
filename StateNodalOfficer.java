package com.example.nsp.layer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class StateNodalOfficer {

	@Id
	@Column(name = "state")
	@GeneratedValue
     private String StateName;
	
	@Column(name = "pwd")
     private String Password;
	
	@Column(name = "officernm")
     private String OfficerName;
	
	@Column(name = "monum")
     private int MobileNumber;
	
	@Column(name = "eid")
     private String EmailID;

@OneToMany
private Set<Institute> insSet = new HashSet<Institute>();


public Set<Institute> getInsSet() {
	return insSet;
}
public void setInsSet(Set<Institute> insSet) {
	this.insSet = insSet;
}
public String getStateName() {
	return StateName;
}
public void setStateName(String stateName) {
	StateName = stateName;
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
public String getEmailID() {
	return EmailID;
}
public void setEmailID(String emailID) {
	EmailID = emailID;
}

}