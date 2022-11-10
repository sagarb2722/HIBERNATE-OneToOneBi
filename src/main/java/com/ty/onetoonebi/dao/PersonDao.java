package com.ty.onetoonebi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.Adharcard;
import com.ty.onetoonebi.dto.Person;

public class PersonDao {
public void savePerson(Person person){
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Adharcard adharcard=person.getCard();
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(adharcard);
	entityTransaction.commit();
}
}
