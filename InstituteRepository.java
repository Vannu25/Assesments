package com.example.nsp.layer3;

import java.util.List;

import com.example.nsp.layer2.Institute;

public interface InstituteRepository {
	
void insertInstitute(Institute iobj); //C
	
	Institute selectInstitute(int inscode); //R
	List<Institute> selectInstitutes(); //RA
	
	void updateInstitute(Institute iobj); //U
	void deleteInstitute(int inscode); //D

}

