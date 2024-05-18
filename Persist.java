package com.jsp.classroom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Persist {
	public static void main(String[] args) {
		
		EntityManagerFactory enityEntityManagerFactory = Persistence.createEntityManagerFactory("m2");
		EntityManager entityManager = enityEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Classroom c = new Classroom();
//		c.setId(4);
		c.setName("Amit");
		c.setLocation("Khanda");
		
		entityTransaction.begin();
		entityManager.persist(c);
		entityTransaction.commit();
		
		System.out.println("Successful");
		
	}
}
