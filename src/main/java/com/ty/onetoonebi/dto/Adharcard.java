package com.ty.onetoonebi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Adharcard {
	@Id
	
	private int id;
	private String name ;
	private int Adharnumber;
	@OneToOne
	private Person person;
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdharnumber() {
		return Adharnumber;
	}
	public void setAdharnumber(int adharnumber) {
		Adharnumber = adharnumber;
	}
	
}
