package com.example.nsp.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.example.nsp.layer2.Institute;



public class InstituteRepositoryImpl extends BaseRepository implements InstituteRepository {
	public InstituteRepositoryImpl() {
		System.out.println("InstituteRepositoryImpl ..");	
}

@Transactional
public void insertInstitute(Institute iobj) {
	
	super.persist(iobj); // invoking the dummy persist of the super class
	System.out.println("institute inserted...");
}

@Override
public Institute selectInstitute(int inscode) {
	// TODO Auto-generated method stub
	System.out.println("InstituteRepositoryImpl : selecting institute by inscode");
	Institute ins = super.find(Institute.class, inscode);
	
	return ins;
}

@Override
public List<Institute> selectInstitutes() {
	List<Institute>  insList = new ArrayList<Institute>();

		System.out.println("InstituteRepositoryImpl : Selecting all institutes...");
		return super.findAll("Institutes");
	
}

@Transactional
public void updateInstitute(Institute iobj) {
	// TODO Auto-generated method stub
	System.out.println("InstituteRepositoryImpl : Updating institues...");
	super.merge(iobj);
}

@Transactional
public void deleteInstitute(int inscode) {
	// TODO Auto-generated method stub
	System.out.println("InstituteRepositoryImpl : Deleting institute");
	super.remove(Institute.class, inscode);
}


}
