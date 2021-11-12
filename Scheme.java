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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "scheme")
public class Scheme {

	
@Id
@Column(name = "schid")
@GeneratedValue
private int SchemeID;	

@Column(name = "schname")
private String SchemeName;

@Column(name = "lastappldate")
private LocalDate LastApplyDate;

@Column(name = "amt")
private int Amount;

@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
@JoinTable(name="studentapplication", 
		joinColumns={@JoinColumn(name="sid")},
		inverseJoinColumns={@JoinColumn(name="schid")})

private Set<StudentApplication> studentapplications; //getApplications()



public Set<StudentApplication> getStudentapplications() {
	return studentapplications;
}
public void setStudentapplications(Set<StudentApplication> studentapplications) {
	this.studentapplications = studentapplications;
}
public int getSchemeID() {
	return SchemeID;
}
public void setSchemeID(int schemeID) {
	SchemeID = schemeID;
}
public String getSchemeName() {
	return SchemeName;
}
public void setSchemeName(String schemeName) {
	SchemeName = schemeName;
}
public LocalDate getLastApplyDate() {
	return LastApplyDate;
}
public void setLastApplyDate(LocalDate lastApplyDate) {
	LastApplyDate = lastApplyDate;
}
public int getAmount() {
	return Amount;
}
public void setAmount(int amount) {
	Amount = amount;
}

}
