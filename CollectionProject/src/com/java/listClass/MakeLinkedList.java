package com.java.listClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.java.linkedList.ContactsLog;


public class MakeLinkedList {
	public static void main (String[] args) {
		ContactsLog log1 = new ContactsLog("Vanashree","9763445184","vanubandla25@gmail.com","Vannu25","Vanashree");
		ContactsLog log2 = new ContactsLog("Sid","2992892999","sid510@gmail.com","sid510","Sidd");
		ContactsLog log3 = new ContactsLog("Ajinkya","9087654324","ajinkya@gmail.com","ajinkya77","ajnkya4555");
		ContactsLog log4 = new ContactsLog("Lokesh","6778889890","lokesh@gmail.com","lokesh456","lokesh256");
		ContactsLog log5 = new ContactsLog("sheba","5678908765","sheba_john@gmail.com","sheba123","sheba456");
		ContactsLog log6 = new ContactsLog("Surendra","8224849403","Suri.9@gmail.com","Suri09","Surendra");

		LinkedList<ContactsLog> linkedList = new LinkedList<>();
		linkedList.add(log1);
		linkedList.add(log2);
		linkedList.add(log3);
		linkedList.add(log4);
		linkedList.add(log5);
		linkedList.add(log6);
		Iterator<ContactsLog> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			ContactsLog theLog = iterator.next();
			System.out.println("the Log : "+theLog);
		}
		System.out.println("-----------------");
		for (ContactsLog phoneLog : linkedList) {
			System.out.println("the Log : "+phoneLog);
		}

		 
	}

}
