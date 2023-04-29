package com.soni.jpaTutorial;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Fetching a Candidate with id : 1 from database table : Candidates
        Candidates candidate = entityManager.find(Candidates.class, 1);
        System.out.println(candidate);
        
        // Inserting a new Candidate into database table : Candidates 
        Candidates candidate2 = new Candidates();
        candidate2.setId(4);
        candidate2.setFirstName("Ekesh");
        candidate2.setSkills("Django");
        
        entityManager.getTransaction().begin(); // starting the transaction
        entityManager.persist(candidate2); // storing candidate2 into the database
        entityManager.getTransaction().commit(); // commit the transaction
        System.out.println(candidate2);
        
    }
}
