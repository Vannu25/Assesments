package com.example.nsp.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.example.nsp.layer2.Institute;
import com.example.nsp.layer2.StateNodalOfficer;

public class StateNodalOfficerRepositoryImpl extends BaseRepository implements StateNodalOfficerRepository {
	public StateNodalOfficerRepositoryImpl() {
		System.out.println("StateNodalOfficerRepositoryImpl ..");	
}
	@Transactional
	public void insertStateNodalOfficer(StateNodalOfficer stobj) {
		super.persist(stobj); // invoking the dummy persist of the super class
		System.out.println("StateNodalOfficer inserted...");
		
	}

	@Override
	public StateNodalOfficer selectStateNodalOfficer(String statename) {
		System.out.println("StateNodalOfficer RepositoryImpl : selecting StateNodalOfficer  by statename");
		StateNodalOfficer  st = super.find(StateNodalOfficer .class, statename);
		
		return st;
	}

	@Override
	public List<StateNodalOfficer> selectStateNodalOfficers() {
		List<StateNodalOfficer>  stList = new ArrayList<StateNodalOfficer>();

		System.out.println("StateNodalOfficerRepositoryImpl : Selecting all StateNodalOfficer...");
		return super.findAll("StateNodalOfficer");
	}

	@Transactional
	public void updateStateNodalOfficer(StateNodalOfficer stobj) {
		System.out.println("StateNodalOfficerRepositoryImpl : Updating StateNodalOfficer...");
		super.merge(stobj);
		
		
	}

	@Transactional
	public void deleteStateNodalOfficer(String statename) {
		System.out.println("StateNodalOfficerRepositoryImpl : Deleting StateNodalOfficer");
		super.remove(StateNodalOfficer.class, statename);
		
	}
	

}
