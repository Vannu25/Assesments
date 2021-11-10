package com.example.nsplayer2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name= "sid")
	private int StudentId;
	
	@Column(name = "inscode")
	private int InstituteCode;
	
	@Column(name = "sname")
	private String StudentName;
	
	@Column(name = "dob")
	private LocalDate DOB;
	
	@Column(name = "genger")
	private String Gender;
	
	@Column(name = "monumber")
	private int MobileNumber;
	
	@Column(name = "eid")
	private String EmailId;
	
	@Column(name = "state")
	private String State;
	
	@Column(name = "dist")
	private String District;
	
	@Column (name= "anum")
	private int AadharNumber;
	
	@Column (name = "ifsc")
	private String IFSCcode;
	
	@Column (name = "bankaccnum")
	private int BankAccNumber;
	
	@Column (name = "bankaccname")
	private String BankAccName;
	
	@Column (name = "bal")
	private Float BankBalance;
	
	@Column (name = "pwd")
	private String Password;
	
	
	@OneToMany
	Set<StudentApplication> stuSet = new HashSet<StudentApplication>();
	
	public Set<StudentApplication> getStuSet() {
		return stuSet;
	}
	public void setStuSet(Set<StudentApplication> stuSet) {
		this.stuSet = stuSet;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public int getInstituteCode() {
		return InstituteCode;
	}
	public void setInstituteCode(int instituteCode) {
		InstituteCode = instituteCode;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
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
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getAadharNumber() {
		return AadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		AadharNumber = aadharNumber;
	}
	
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	public int getBankAccNumber() {
		return BankAccNumber;
	}
	public void setBankAccNumber(int bankAccNumber) {
		BankAccNumber = bankAccNumber;
	}
	public String getBankAccName() {
		return BankAccName;
	}
	public void setBankAccName(String bankAccName) {
		BankAccName = bankAccName;
	}
	public Float getBankBalance() {
		return BankBalance;
	}
	public void setBankBalance(Float bankBalance) {
		BankBalance = bankBalance;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}


}
