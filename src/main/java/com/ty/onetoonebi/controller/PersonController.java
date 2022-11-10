package com.ty.onetoonebi.controller;

import com.ty.onetoonebi.dao.PersonDao;
import com.ty.onetoonebi.dto.Adharcard;
import com.ty.onetoonebi.dto.Person;

public class PersonController {
	public static void main(String[] args) {
		
	
	Person person =new Person();
	person.setId(10);
	person.setName("sagar");
	person.setGender("male");
	person.setAge(28);
	
	
	Adharcard adharcard=new Adharcard();
	adharcard.setId(20);
	adharcard.setName("sagar");
	adharcard.setAdharnumber(123);
	
	person.setCard(adharcard);
	adharcard.setPerson(person);
	
	PersonDao dao=new PersonDao();
	dao.savePerson(person);
}
}