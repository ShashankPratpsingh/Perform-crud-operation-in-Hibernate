package com.jsp.classroom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("m2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		We first find the ID from the table before using remove method to delete
		Classroom c = entityManager.find(Classroom.class, 8);
		
//		After finding the ID, we can use the remove method to delete the selected ID from the object c
		if (c != null) {
			entityTransaction.begin();
			entityManager.remove(c);
			entityTransaction.commit();
		}
		else {
			System.out.println("No classroom ID found");
		}
	}

}
