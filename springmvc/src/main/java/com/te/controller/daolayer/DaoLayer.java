package com.te.controller.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.te.controller.model.Register;
@Component
public class DaoLayer {
	public void put(Register reg) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("register");
			EntityManager createEntityManager = emf.createEntityManager();
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(reg);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
