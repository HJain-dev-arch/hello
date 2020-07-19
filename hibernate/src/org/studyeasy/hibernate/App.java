package org.studyeasy.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.hj2;

public class App {

	  public static void main(String[] args) {
		  
		  SessionFactory factory = new Configuration()
				                   .configure("hibernate.cfg.xml")
				                   .addAnnotatedClass(hj2.class)
				                   .buildSessionFactory();
		  
		  Session session = factory.getCurrentSession();
		  
		  try {
			  // Start transaction
			  session.beginTransaction();
			  List<hj2> users = session.createQuery("from hj2").getResultList();
			  
			  for (hj2 temp : users) {
				System.out.println(temp);
			  }
		} finally {
			session.close();
			factory.close();
		}
		
	}
	}