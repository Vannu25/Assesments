package com.java.linkedList;

public class ContactsLog {
	
	String name ;
	String mobileNumber;
	String email;
	String facebookId;
	String instaId;
	public ContactsLog(String name, String mobileNumber, String email, String facebookId, String instaId) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.facebookId = facebookId;
		this.instaId = instaId;
	}
	
	
	@Override
	public String toString() {
		return "ContactsLog [name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", facebookId="
				+ facebookId + ", instaId=" + instaId + "]";
	}


	public void print() {
		System.out.println("ContactsLog [name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", facebookId="
				+ facebookId + ", instaId=" + instaId + "]");
	}

}
