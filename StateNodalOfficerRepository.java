package com.example.nsp.layer3;

import java.util.List;

import com.example.nsp.layer2.StateNodalOfficer;

public interface StateNodalOfficerRepository {
void insertStateNodalOfficer(StateNodalOfficer stobj); //C
	
StateNodalOfficer selectStateNodalOfficer(String statename); //R
	List<StateNodalOfficer> selectStateNodalOfficers(); //RA
	
	void updateStateNodalOfficer(StateNodalOfficer stobj); //U
	void deleteStateNodalOfficer(String statename); //D

}