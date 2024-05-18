package com.jsp.classroom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class find {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("m2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		Classroom c = entityManager.find(Classroom.class, 4);
		
		if (c != null) {
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getLocation());
		}
		else {
			System.out.println("No car ID found");
		}
	}

}
