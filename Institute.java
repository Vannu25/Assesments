package com.example.nsp.layer2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="InstituteApplication")
public class Institute {
	@Id
	@Column(name = "inscode")
	@GeneratedValue
	private int InstituteCode;
	
	@Column(name = "state")
	private String StateName;
	
	@Column(name = "insname")
	private String InstituteName;
	
	@Column(name = "city")
	private String City;
	
	@Column(name = "district")
	private String District;
	
	@Column(name = "pin")
	private int Pincode;
	
	@Column(name = "dise")
	private int DISEcode;
	
	@Column(name = "uniname")
	private String UniversityName;
	
	@Column(name = "pwd")
	private String Password;
	
	@Column(name = "principal")
	private String Principal;
	
	@Column(name = "ph")
	private int Telephone;
	
	@Column(name = "appldt")
    private LocalDate AppliedDate;
	
	@Column(name = "status")
    private String Status;
	
	@Column(name = "stacpdate")
    private LocalDate StateAcceptedDate;
	
	@Column(name = "minsaccdate")
    private LocalDate MinistryAcceptedDate;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "student") //one student has Many studentapplication
	private Set<Student> stSet = new HashSet<Student>();
	
	@ManyToOne
	@JoinColumn(name= "state")
	private StateNodalOfficer state;
	
	public Set<Student> getStSet() {
		return stSet;
	}
	public void setStSet(Set<Student> stSet) {
		this.stSet = stSet;
	}
	public StateNodalOfficer getState() {
		return state;
	}
	public void setState(StateNodalOfficer state) {
		this.state = state;
	}
	public int getInstituteCode() {
		return InstituteCode;
	}
	public void setInstituteCode(int instituteCode) {
		InstituteCode = instituteCode;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public String getInstituteName() {
		return InstituteName;
	}
	public void setInstituteName(String instituteName) {
		InstituteName = instituteName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public int getDISEcode() {
		return DISEcode;
	}
	public void setDISEcode(int dISEcode) {
		DISEcode = dISEcode;
	}
	public String getUniversityName() {
		return UniversityName;
	}
	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPrincipal() {
		return Principal;
	}
	public void setPrincipal(String principal) {
		Principal = principal;
	}
	public int getTelephone() {
		return Telephone;
	}
	public void setTelephone(int telephone) {
		Telephone = telephone;
	}
	public LocalDate getAppliedDate() {
		return AppliedDate;
	}
	public void setAppliedDate(LocalDate appliedDate) {
		AppliedDate = appliedDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public LocalDate getStateAcceptedDate() {
		return StateAcceptedDate;
	}
	public void setStateAcceptedDate(LocalDate stateAcceptedDate) {
		StateAcceptedDate = stateAcceptedDate;
	}
	public LocalDate getMinistryAcceptedDate() {
		return MinistryAcceptedDate;
	}
	public void setMinistryAcceptedDate(LocalDate ministryAcceptedDate) {
		MinistryAcceptedDate = ministryAcceptedDate;
	} 
    
	

}
