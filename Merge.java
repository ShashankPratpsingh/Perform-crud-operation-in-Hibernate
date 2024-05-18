package com.jsp.classroom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Merge {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("m2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
//		find method to first find the row to select the particular cell by using set method
		Classroom c = entityManager.find(Classroom.class, 5);
		
//		or selecting whole row s=by simply using object creation
//		Classroom c = new Classroom();

		c.setName("Nitin");
		c.setLocation("Ghansoli");
		
		entityTransaction.begin();
		entityManager.merge(c);
		entityTransaction.commit();
		
		System.out.println("Successful");
	}

}
