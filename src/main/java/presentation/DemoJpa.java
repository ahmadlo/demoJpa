package presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Formation;

public class DemoJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 - Ouverture unité de travail JPA
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa-pu");
		
		EntityManager em = emf.createEntityManager();
		
		// 2 - Ouverture de la transaction
			
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		// 3 - Instanciation Objet metier
		
		Formation formation = new Formation("JPA cours");
		
		// 4 - Persistance Objet / Relationnel : création d'un enregistrement en base 
		
		em.persist(formation);
		
		// 5 - Fermeture transaction 
		
		tx.commit();
		
		// 6 - Fermeture unité de travail JPA
		
		em.close();
		emf.close();

	}

}
