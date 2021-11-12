package com.example.nsp.layer2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name= "sid")
	//@GeneratedValue
	private int studentId;
	
	@Column(name = "inscode")
	private int instituteCode;
	
	@Column(name = "sname")
	private String studentName;
	
	@Column(name = "dob")
	private LocalDate dob;
	
	@Column(name = "genger")
	private String gender;
	
	@Column(name = "monumber")
	private String mobileNumber;
	
	@Column(name = "eid")
	private String emailId;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "dist")
	private String district;
	
	@Column (name= "anum")
	private long aadharNumber;
	
	@Column (name = "ifsc")
	private String IFSCcode;
	
	@Column (name = "bankaccnum")
	private long bankAccNumber;
	
	@Column (name = "bankaccname")
	private String bankAccName;
	
	@Column (name = "bal")
	private Float bankBalance;
	
	@Column (name = "pwd")
	private String password;
	
			
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "institue") //one student has Many studentapplication
	private Set<StudentApplication> stuSet = new HashSet<StudentApplication>();
	
	@ManyToOne
	@JoinColumn(name = "inscode")
	Institute institute;
	
	public Set<StudentApplication> getStuSet() {
		return stuSet;
	}
	public void setStuSet(Set<StudentApplication> stuSet) {
		this.stuSet = stuSet;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		studentId = studentId;
	}
	public int getInstituteCode() {
		return instituteCode;
	}
	public void setInstituteCode(int instituteCode) {
		instituteCode = instituteCode;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		studentName = studentName;
	}
	public LocalDate getDOB() {
		return dob;
	}
	public void setDOB(LocalDate dOB) {
		dob = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		emailId = emailId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		district = district;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		aadharNumber = aadharNumber;
	}
	
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	public long getBankAccNumber() {
		return bankAccNumber;
	}
	public void setBankAccNumber(long bankAccNumber) {
		bankAccNumber = bankAccNumber;
	}
	public String getBankAccName() {
		return bankAccName;
	}
	public void setBankAccName(String bankAccName) {
		bankAccName = bankAccName;
	}
	public Float getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(Float bankBalance) {
		bankBalance = bankBalance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		password = password;
	}


}
