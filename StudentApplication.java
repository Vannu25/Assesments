package com.example.nsp.layer2;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "studentapplication")
public class StudentApplication {

	@Column(name = "sid")
	private int StudentId;
	
	@Column (name= "schid")
	private int SchemeId;
	
	@Column (name = "religion")
	private String Religion;
	
	@Column(name = "Commu")
	private String Community;
	
	@Column(name = " fname")
	private String FatherName;
	
	@Column (name = "mname")
	private String MotherName;
	
	@Column (name = "inc")
	private Float Income;
	
	@Column (name = "course")
	private String Course;
	
	@Column (name = "10th Per")
	private Float XthPercentage;
	
	@Column (name = "12th Per")
	private Float XIIthPercentage;
	
	@Column (name = "disable")
	private String Disability;
	
	@Column (name = "appldt")
	private LocalDate AppliedDate;
	
	@Column (name = "status")
	private String Status;
	
	@Column (name = "insaccpdate")
	private LocalDate InsAcceptedDate;
	
	@Column (name = "stateaccpdate")
	private LocalDate StateAcceptedDate;
	
	@Column (name = "miniaccpdate")
	private LocalDate MinistryAcceptedDate;
	
	@ManyToOne
	@JoinColumn(name= "sid")
	
	private Student sid;
	

	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="schemes", 
			joinColumns={@JoinColumn(name="schid")},
			inverseJoinColumns={@JoinColumn(name="sid")})
	private Set<Scheme> schemes; //getSchemes()

	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	
	
	public Set<Scheme> getSchemes() {
		return schemes;
	}
	public void setSchemes(Set<Scheme> schemes) {
		this.schemes = schemes;
	}
	public Student getSid() {
		return sid;
	}
	public void setSid(Student sid) {
		this.sid = sid;
	}
	public int getSchemeId() {
		return SchemeId;
	}
	public void setSchemeId(int schemeId) {
		SchemeId = schemeId;
	}
	public String getReligion() {
		return Religion;
	}
	public void setReligion(String religion) {
		Religion = religion;
	}
	public String getCommunity() {
		return Community;
	}
	public void setCommunity(String community) {
		Community = community;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public Float getIncome() {
		return Income;
	}
	public void setIncome(Float income) {
		Income = income;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public Float getXthPercentage() {
		return XthPercentage;
	}
	public void setXthPercentage(Float xthPercentage) {
		XthPercentage = xthPercentage;
	}
	public Float getXIIthPercentage() {
		return XIIthPercentage;
	}
	public void setXIIthPercentage(Float xIIthPercentage) {
		XIIthPercentage = xIIthPercentage;
	}
	public String getDisability() {
		return Disability;
	}
	public void setDisability(String disability) {
		Disability = disability;
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
	public LocalDate getInsAcceptedDate() {
		return InsAcceptedDate;
	}
	public void setInsAcceptedDate(LocalDate insAcceptedDate) {
		InsAcceptedDate = insAcceptedDate;
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
