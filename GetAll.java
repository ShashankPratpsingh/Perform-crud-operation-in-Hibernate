package com.jsp.classroom;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("m2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String sql = "SELECT c FROM Classroom c";
		
//		Query is an Interface present in persistence package
		Query query = entityManager.createQuery(sql);
		List<Classroom> c = query.getResultList();
		
		for(Classroom cc : c) {
			System.out.println("==========");
			System.out.println(cc.getId());
			System.out.println(cc.getName());
			System.out.println(cc.getLocation());
		}
	}
}
