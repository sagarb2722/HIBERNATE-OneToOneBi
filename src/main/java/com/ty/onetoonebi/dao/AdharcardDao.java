package com.ty.onetoonebi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.Adharcard;
import com.ty.onetoonebi.dto.Person;

public class AdharcardDao {
	public void saveAdharcard(Adharcard adharcard){
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=adharcard.getPerson();
		entityTransaction.begin();
		entityManager.persist(adharcard);
		entityManager.persist(person);
		entityTransaction.commit();
	}

}
